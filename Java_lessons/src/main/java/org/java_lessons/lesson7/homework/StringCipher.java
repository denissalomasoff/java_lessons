package org.java_lessons.lesson7.homework;

public class StringCipher {
    String decode(String str, Integer offset) {
        if ((str == null) || str.isEmpty() || (offset == null)) {
            System.out.println("Строка или смещение не введены");
            return null;
        }
        final String inputString = str.trim().replaceAll("[\\s\\-_]", "");
        final char[] charInputString = inputString.toCharArray();
        // цикл проходит по всем элементам массива
        for (int i = 0; i < charInputString.length; i++) {
            charInputString[i] = (char) (offset + charInputString[i]);
        }
        return new String(charInputString);
    }
}
