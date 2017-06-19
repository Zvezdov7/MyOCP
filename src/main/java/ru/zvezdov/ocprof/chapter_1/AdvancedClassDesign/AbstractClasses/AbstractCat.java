package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.AbstractClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Dmitry Zvezdov
 *         07.04.17.
 */
public abstract class AbstractCat implements Meowable{

    abstract  void clean();
//    void clean(){ }
//    protected void clean(){}
//    private void clean(){} // Hiding

    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        for (;;);

    }
}
