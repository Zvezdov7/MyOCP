package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Generics.PlayGround;

/**
 * Created by Dmitry on 19.06.2017.
 */
public class _0_Pair_SimpleGeneric<T> {
    private T first;
    private T second;

    public _0_Pair_SimpleGeneric() {
    }
    public _0_Pair_SimpleGeneric(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }
    public void setSecond(T second) {
        this.second = second;
    }
}
