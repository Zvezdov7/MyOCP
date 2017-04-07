package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Enums;

/**
 * @author Dmitry Zvezdov
 *         07.04.17.
 */
public class PlayWithEnums {
    public static void main(String[] args) {
        Season s = Season.WINTER;
        Season ss = Season.SPRING;
        System.out.println(Season.SUMMER);
        System.out.println(s == Season.WINTER);

        for (Season season: Season.values()){
            System.out.println(season.name() + ": " + season.ordinal());
        }

        Season s1 = Season.valueOf("SUMMER");
//        Season s2 = Season.valueOf("summer"); // IllegalArgumentException

        Season summer = Season.SUMMER;
        switch (summer){
            case WINTER:
                System.out.println("Winter");
                break;
            case SPRING:
                System.out.println("Spring");
                break;
            case SUMMER:
                System.out.println("Summer");
                break;
            case FALL:
                System.out.println("Fall");
                break;
            default:
                System.out.println("It's gonna be a summer");
        }

        System.out.println(summer.getClass() + " " + summer.hashCode());

        /*
            DOESN'T COMPILE
         */
//        switch (summer){
//            case 0:
//                System.out.println("Ouuuuups");
//                break;
//        }
        summer.printExpectedVisitors();

        /*
            Значения перечислений можно сделать вложенными классами, которые будут наследоваться
            от базового класса перечисления и смогут переопределять его методы, а так же добавлять свои
         */
        s.printHours();
    }
}
