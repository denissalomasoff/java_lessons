package ru.lessons.lesson6.step2;

public class RecordRunner {
    public static void main(String[] args) {
        final ru.lessons.lesson6.step2.Person ivan = new ru.lessons.lesson6.step2.Person("Ivan", 33, "QA", true);
        final ru.lessons.lesson6.step2.Person ivan1 = new ru.lessons.lesson6.step2.Person("Ivan", 33, "QA", true);
        ru.lessons.lesson6.step2.Person copy = new ru.lessons.lesson6.step2.Person(ivan.name(), ivan.age(), ivan.job(), ivan.isMarried());

        System.out.println(ivan);
        System.out.println(ivan.age());
        System.out.println(ivan.name());

        System.out.println(ivan.equals(ivan1));
    }
}
