package org.java_lessons.lesson8.homework;

public class StringRevers {
    public static void main(String[] args) {
        final String string = "rxdtcfvghbjnkucbhqqqAAAty";
        // Преобразуем строку в массив;
        char[] stringArray = string.toCharArray();
        // Создаем новый массив, равный по длине массиву stringArray, в который запишем развернутый массив stringArray;
        char[] reverseStringArray = new char[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            //Каждый элемент массива перебирает массив с конца (stringArray.length - 1) и с каждой итерацией сдвигается влево
            reverseStringArray[i] = stringArray[stringArray.length - 1 - i];
        }
        // Записать развернутый массив в строку stringRivers
        String stringRevers = new String(reverseStringArray);
        System.out.println("Развернутая строка: " + stringRevers);

    }
}
