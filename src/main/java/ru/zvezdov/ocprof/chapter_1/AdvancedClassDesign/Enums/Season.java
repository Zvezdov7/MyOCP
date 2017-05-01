package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Enums;

/**
 * @author Dmitry Zvezdov
 *         07.04.17.
 */
public enum Season {
    WINTER("Low"){
        public void printHours(){
            System.out.println("9am - 3pm");
        }
        public void foo(){
            System.out.println("Foo");
        }
    },
    SPRING("Medium", true),
    SUMMER("High", true),
    FALL("Medium"); //Semicolon is required if there is anything in the enum besides the values

    private String expectedVisitors;
    private boolean itIsOK;

    Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    Season(String expectedVisitors, boolean itIsOK) {
        System.out.println("Constrict enum");
        this.expectedVisitors = expectedVisitors;
        this.itIsOK = itIsOK;
    }

    public void printExpectedVisitors(){
        System.out.println(expectedVisitors);
    }

    public void printHours(){};


//    public abstract void someMethod(); // Will compile if and only if all enum values overrides this method
}
//class SomeClass extends Season{} // NOT COMPILE - can't extend any Enum
