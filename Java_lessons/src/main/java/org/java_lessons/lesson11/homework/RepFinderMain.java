package org.java_lessons.lesson11.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepFinderMain {
    public static void main(String[] args) {
        final List<String> stroka = new ArrayList<>();
        stroka.add("Привет, Андрей");
        stroka.add("Как твои дела");
        stroka.add("Как твои дела?");
        stroka.add("Привет, мир!");
        stroka.add("Hello!");
        stroka.add("Hello, world");
        stroka.add("Hello, world!");
        stroka.add("Hello");
        stroka.add("Hollywood");
        stroka.add("Как твои дела");
        // В переменную result записывается результат работы boolean метода проверки на уникальность;
        boolean result = ReplicaFinder.allItemsAreUnique(stroka);
        System.out.println("Строки уникальны? " + (result ? "Да" : "Нет"));
    }
}
