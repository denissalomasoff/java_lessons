package org.java_lessons.lesson5.step4;

public class Main {
    public static void main(String[] args) {
        // числа в диапазоне 0 до 127 в пуле целых чисел
        Integer number1 = 11;
        Integer number2 = 11;

        System.out.println("11 == 11 " + (number1 == number2));

        Integer number3 = 1111;
        Integer number4 = 1111;
        System.out.println("1111 == 1111 " + (number3 == number4));

        // Корректное сравнение
        System.out.println("1111 equals 1111 " + (number3.equals(number4)));
    }
}
