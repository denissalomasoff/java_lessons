package ru.lessons.lesson12.step2;

import java.util.*;

public class MapExecutor {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one"); // O(1)
        map.put(2, "two"); // O(1), O(logN)
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");

        Map<ru.lessons.lesson12.step2.Test, Integer> testMap = new HashMap<>();
        testMap.put(new ru.lessons.lesson12.step2.Test(100, "1"), 1);
        testMap.put(new ru.lessons.lesson12.step2.Test(3, "1"), 2);

        System.out.println(testMap);

        Map<ru.lessons.lesson12.step2.Test, Integer> treeMap = new TreeMap<>(Comparator.comparing(ru.lessons.lesson12.step2.Test::getId).reversed());
        treeMap.putAll(testMap);

        System.out.println(treeMap);


    }
}
