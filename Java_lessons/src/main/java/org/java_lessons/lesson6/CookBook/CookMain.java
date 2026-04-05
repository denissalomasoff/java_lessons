package org.java_lessons.lesson6.CookBook;

public class CookMain {
    public static void main(String[] args) {
        final Chicken chicken = new Chicken();
        final Dorado dorado = new Dorado();
        final Duck duck = new Duck();
        final Salmon salmon = new Salmon();
        final Sturgeon sturgeon = new Sturgeon();
        final Turkey turkey = new Turkey();

        Cook.isCooking(chicken);
        Cook.isCooking(dorado);
        Cook.isCooking(duck);
        Cook.isCooking(salmon);
        Cook.isCooking(sturgeon);
        Cook.isCooking(turkey);

    }
}
