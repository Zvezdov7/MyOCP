package ru.zvezdov.ocprof.chapter_7.Concurrency.ManagingConcurrentProcesses.ForkJoin;

import java.util.Random;
import java.util.concurrent.RecursiveAction;

/**
 * @author Dmitry Zvezdov
 *         19.04.17.
 */
public class WeighAnimalAction extends RecursiveAction {
    private int start;
    private int end;

    private Double[] wights;

    public WeighAnimalAction(Double[] wights, int start, int end) {
        this.start = start;
        this.end = end;
        this.wights = wights;
    }

    @Override
    protected void compute() {
        if (end-start <= 3)
            for (int i = 0; i < end; i++) {
                wights[i] = (double)new Random().nextInt(100);
                System.out.println("Animal Weight: " + i);
            }
        else {
            int middle = start+((end-start)/2);
            System.out.println("[start=" + start + ", middle=" + middle + ",end=" + end + "]");
            invokeAll(new WeighAnimalAction(wights, start, middle),
                    new WeighAnimalAction(wights, middle, end));
        }
    }
}
