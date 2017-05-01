package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.String;

import ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.ComparableVsComparator.MyComparable;

import java.io.Serializable;

/**
 * @author Dmitry Zvezdov
 *         27.04.17.
 */
public final class MyString implements MyComparable, MyCharSequence, Serializable{


    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public MyCharSequence charSequence(int start, int end) {
        return null;
    }
}
