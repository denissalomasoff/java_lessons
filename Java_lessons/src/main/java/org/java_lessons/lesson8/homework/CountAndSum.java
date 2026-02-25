package org.java_lessons.lesson8.homework;

public class CountAndSum {
    public static void main(String[] args) {
        final int num = 1234456771;
        // Преобразовать число в строку
        String numStr = Integer.toString(num);
        // Создать массив чисел, длина которого равна длине строки
        int[] digit = new int[numStr.length()];
        // Пройти циклом последовательно по каждому элементу массива digit
        for (int i = 0; i < digit.length; i++) {
            //Запись в каждый элемент массива значения из преобразованного в строку числа
            digit[i] = Character.getNumericValue(numStr.charAt(i));
        }
        System.out.println("Количество цифр: " + digit.length);
        // Ввод переменной для подсчета суммы
        int sum = 0;
        for (int i = 0; i < digit.length; i++) {
            //Каждый элемент массива складывается со значением переменной sum
            sum = digit[i] + sum;
        }
        System.out.println("Сумма цифр: " + sum);
    }
}



