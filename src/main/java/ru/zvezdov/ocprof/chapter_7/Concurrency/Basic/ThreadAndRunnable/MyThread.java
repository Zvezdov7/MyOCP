package ru.zvezdov.ocprof.chapter_7.Concurrency.Basic.ThreadAndRunnable;

import sun.nio.ch.Interruptible;

import java.security.AccessControlContext;

/**
 * @author Dmitry Zvezdov
 *         02.05.17.
 */
public class MyThread implements MyRunnable {
    private static native void registerNatives();
    static {
        registerNatives();
    }

    private volatile char name[];
    private int priority;
    private MyThread threadQ;
    private long eetop;

    private boolean single_step;
    private boolean daemon = false;

    private boolean stillborn = false;

    /* ! */
    private MyRunnable target;
    private ThreadGroup group;

    private ClassLoader contextClassLoader;
    private AccessControlContext inheritedAccessControlContext;

    private static int threadInitNumber;
    private static synchronized int nextThreadNum(){ return threadInitNumber++; }

//    ThreadLocal.ThreadLocalMap threadLocals = null;
//    ThreadLocal.ThreadLocalMap inheritableThreadLocals = null;

    private long stackSize;
    private long nativeParkEventPointer;

    /*
    Thread ID
     */
    private long tid;

    /* For getting Thread ID */
    private static long threadSeqNumber;

    private volatile int threadStatus = 0;
    private static synchronized long nextThreadId(){ return ++threadSeqNumber;}

    volatile Object parkBlocker;

    private volatile Interruptible blocker;
    private final Object blockerLock = new Object();

    void blockedOn(Interruptible b){
        synchronized (blockerLock){
            blocker = b;
        }
    }

    private static final int MIN_PRIORITY = 0;
    private static final int NORM_PRIORITY = 5;
    private static final int MAX_PRIORITY = 10;

    /**
     * Returns a reference to the currently executing thread object.
     *
     * @return  the currently executing thread.
     */
    private static native Thread currentThread();


    /**
     *  Уступать
     *
     * A hint to the scheduler that the current thread is willing to yield
     * its current use of a processor. The scheduler is free to ignore this
     * hint.
     */
    public static native void yield();

    /**
     * Causes the currently executing thread to sleep (temporarily cease
     * execution) for the specified number of milliseconds, subject to
     * the precision and accuracy of system timers and schedulers. The thread
     * does not lose ownership of any monitors.
     *
     * @throws  InterruptedException
     *          if any thread has interrupted the current thread. The
     *          <i>interrupted status</i> of the current thread is
     *          cleared when this exception is thrown.
     */
    private static native void sleep(long millis) throws InterruptedException;

    private static void sleep(long millis, long nanos) throws InterruptedException { }


    /**
     * Initializes a Thread with the current AccessControlContext.
     * @see #init(ThreadGroup,Runnable,String,long,AccessControlContext)
     */
    private void init(ThreadGroup g, Runnable target, String name, long stackSize){}

    /**
     * Initializes a Thread.
     *
     * @param g the Thread group
     * @param target the object whose run() method gets called
     * @param name the name of the new Thread
     * @param stackSize the desired stack size for the new thread, or
     *        zero to indicate that this parameter is to be ignored.
     * @param acc the AccessControlContext to inherit, or
     *            AccessController.getContext() if null
     */
    private void init(ThreadGroup g, Runnable target, String name,
                      long stackSize, AccessControlContext acc) { }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public MyThread(){ init(null, null, "Thread-" + nextThreadNum(), 0);}

    public MyThread(Runnable target) { init(null, target, "Thread-" + nextThreadNum(), 0); }

    MyThread(Runnable target, AccessControlContext acc) { init(null, target, "Thread-" + nextThreadNum(), 0, acc); }

    public MyThread(ThreadGroup group, Runnable target) { init(group, target, "Thread-" + nextThreadNum(), 0); }

    public MyThread(String name){ init(null, null, name, 0); }

    public MyThread(ThreadGroup group, String name) { init(group, null, name, 0); }

    public MyThread(Runnable target, String name) { init(null, target, name, 0); }

    public MyThread(ThreadGroup group, Runnable target, String name) { init(group, target, name, 0); }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) { init(group, target, name, stackSize); }


    /**
     * Causes this thread to begin execution; the Java Virtual Machine
     * calls the <code>run</code> method of this thread.
     * <p>
     * The result is that two threads are running concurrently: the
     * current thread (which returns from the call to the
     * <code>start</code> method) and the other thread (which executes its
     * <code>run</code> method).
     * <p>
     * It is never legal to start a thread more than once.
     * In particular, a thread may not be restarted once it has completed
     * execution.
     *
     * @exception  IllegalThreadStateException  if the thread was already
     *               started.
     */
    public synchronized void start(){ }

    private native void start0();

    /**
     * This method is called by the system to give a Thread
     * a chance to clean up before it actually exits.
     */
    private void exit() {
    }

    @Deprecated
    public final void stop(){}

    /**
     * Interrupts this thread.
     *
     * <p> Interrupting a thread that is not alive need not have any effect.
     *
     * @throws  SecurityException
     *          if the current thread cannot modify this thread
     */
    public void interrupt() { }

    public static boolean interrupted(){ return false; }

    public boolean isInterrupted(){ return false; }

    private native boolean isInterrupted(boolean clearInterrupted);

    @Deprecated
    public void destroy(){}

    public final native boolean isAlive();

    // Getters/Setters and Join ///

    public long getID(){
        return 1;
    }

    @Override
    public void run() {

    }
}
