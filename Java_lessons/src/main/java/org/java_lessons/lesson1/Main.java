package org.java_lessons.lesson1;

public class Main {
    public static void main(String[] args) {
        // Числа
        byte byteVar = 10;
        short shortVar = 2;
        int intVar = 3;
        long longVar = 4;

        //float
        float floatVar = 123.45f;
        double doubleVar = 1122.33d;

        var number = 1234;
        //+ - * / %
        var result_sum = byteVar + intVar;
        var result_minus = byteVar - intVar;
        var result_multiply = byteVar * intVar;
        var result_split = byteVar / intVar;

        var result1 = floatVar + byteVar;

        // boolean
        boolean b = true;
        boolean c = false;

        // && (И) || (ИЛИ) ! (НЕТ)
        // char
        char d = 'a';

        System.out.println("сумма "+result_sum);
        System.out.println("разница "+result_minus);
        System.out.println("произвдение "+result_multiply);
        System.out.println("целочисленное деление "+result_split);
        System.out.println("Ярослав - друг, товарищ и брат!");
    }
}
