package org.java_lessons.lesson10.homework;

import java.util.Arrays;

public class AnargammCheck {
    public static boolean anagram(String word1, String word2) {
        //Преобразрвать строки word1 word2 в массивы символов;
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        //Сортировать оба массива в алфавитном порядке;
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        //Сравнить отсортрованные массивы.
        return Arrays.equals(chars1, chars2);
    }
}
