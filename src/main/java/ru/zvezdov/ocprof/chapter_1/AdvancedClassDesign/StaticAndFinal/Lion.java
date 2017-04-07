package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.StaticAndFinal;

/**
 * @author Dmitry Zvezdov
 *         07.04.17.
 */
public final class Lion extends AbstractCat {

    @Override
    final void clean() { // No static because overriding
        super.clean();
    }
}
