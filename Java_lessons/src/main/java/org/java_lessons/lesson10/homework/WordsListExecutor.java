package org.java_lessons.lesson10.homework;

import java.util.Scanner;


public class WordsListExecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое слово");
        String word1 = scanner.nextLine();

        System.out.println("Введите второе слово");
        String word2 = scanner.nextLine();

        if (word1.isEmpty() || word2.isEmpty()) {
            System.out.println("Одно, или второе, или оба два слова не введены =)");
        } else if (word1.equals(word2)) {
            System.out.println("Слова эквивалентны.");
        } else if (word1.length() != word2.length()) {
            System.out.println("Слова имеют разную длину.");
        } else if (AnargammCheck.Anagram(word1, word2)) {
            System.out.println("Слова - анаграммы.");
        } else {
            System.out.println("Слова имеют одинаковую длину, но не являются анаграммами.");
        }
    }

    //scanner.close();
}
