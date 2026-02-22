package org.java_lessons.lesson7.homework;

public class StringCipher {
    public String decode(String str, Integer offset) {
        if ((str == null) || str.isEmpty() || (offset == null)) {
            System.out.println("Строка или смещение не введены");
            return "";
        }
        final char[] charInputString = str.toCharArray();
        // цикл проходит по всем элементам массива и увеличивает на величину "offset"
        for (int i = 0; i < charInputString.length; i++) {
            charInputString[i] = (char) (offset + charInputString[i]);
        }
        // возвращает результат сложения каждого элемента массива с величной offset в новую строку
        return new String(charInputString);
    }
}
