package ru.lessons.lesson8.step5;

public class Main {
    public static void main(String[] args) {
        final var palindromValidator = new ru.lessons.lesson8.step5.PalindromValidator();
        System.out.println(palindromValidator.validate("abba", true));
        System.out.println(palindromValidator.validate("abc", false));
        System.out.println(palindromValidator.validate("Мадам", true));
        System.out.println(palindromValidator.validate("v", true));
    }
}
