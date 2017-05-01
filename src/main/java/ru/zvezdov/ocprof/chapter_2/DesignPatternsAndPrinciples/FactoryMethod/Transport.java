package ru.zvezdov.ocprof.chapter_2.DesignPatternsAndPrinciples.FactoryMethod;

/**
 * @author Dmitry Zvezdov
 *         25.04.17.
 */
public interface Transport {
    Transport createTransport();
}
class Ship implements Transport {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
class Car implements Transport {

    @Override
    public Transport createTransport() {
        return new Car();
    }
}
