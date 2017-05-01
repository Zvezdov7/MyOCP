package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.String;

import ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Object.MyObject;

/**
 * @author Dmitry Zvezdov
 *         27.04.17.
 */
public interface MyCharSequence {
    int length();
    char charAt(int index);
    MyCharSequence charSequence(int start, int end);
    public String toString();


}
