package ru.lessons.lesson12.step3;

import java.util.*;

public class Anagramma {
    public static void main(String[] args) {
        final var s1 = "кино";
        final var s2 = "пино";

        final var res = isAnagramma(s1, s2);
    }

    private static boolean isAnagramma(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        Map<Character, Integer> map1 = new TreeMap<>();
        Map<Character, Integer> map2 = new TreeMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (map1.containsKey(s1.charAt(i))) {
                map1.put(s1.charAt(i), map1.get(s1.charAt(i)) + 1);
            } else {
                map1.put(s1.charAt(i), 1);
            }
//            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
        }
//        Arrays.asList(s1.split("")).forEach(s -> map1.put(s, map1.getOrDefault(s, 0) + 1));
//        Arrays.asList(s2.split("")).forEach(s -> map2.put(s, map2.getOrDefault(s, 0) + 1));

        return map1.equals(map2);
    }
}
