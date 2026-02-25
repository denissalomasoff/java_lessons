package org.java_lessons.lesson8.homework;


public class StringCharacters {
    public static void main(String[] args) {
        final String testStr = "IjomwidjfnqwfgUilmnbvcx";
        // Преобразование строки в массив символов
        char[] charStrArray = testStr.toCharArray();
        int glas = 0;
        int soglas = 0;
        // Справочник гласных букв
        final String glasDict = "AaEeIiOoUu";
        // Циклом пройти по каждому элементу массива
        for (int i = 0; i < charStrArray.length; i++) {
            // Проверить, что элемент массива является буквой
            if (Character.isLetter(charStrArray[i])) {
                // Найти позицию символа в строке glasDict, если не найдена, возвращает -1
                if (glasDict.indexOf(charStrArray[i]) != -1) {
                    glas = glas + 1;
                } else {
                    soglas = soglas + 1;
                }

            }

        }
        System.out.println("Количество гласных букв: " + glas);
        System.out.println("Количество согласных букв: " + soglas);
    }
}