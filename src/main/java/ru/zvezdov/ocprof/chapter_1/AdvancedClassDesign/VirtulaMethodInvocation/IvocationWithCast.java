package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.VirtulaMethodInvocation;

/**
 * @author Dmitry Zvezdov
 *         09.05.17.
 */

abstract class W {
    int i = 0;

    public void setI(int i) {
        this.i = i;
        System.out.println(i);
    }
}
abstract class Wi extends W {
    int i = 1;

    public int getI() {
        System.out.println("Wi " + i);
        return i;
    }
}

class WiFi extends Wi {
    int i = 2;

    public int getI() {
        System.out.println("WiFi " + i);
        return i;
    }

    @Override
    public void setI(int i) {
        this.i = i;
    }
}



public class IvocationWithCast {
    public static void main(String[] args) {
        Wi wi = new WiFi();
        wi.getI();
        ((Wi) wi).getI();
        ((W) wi).setI(1);
        wi.getI();
    }
}
