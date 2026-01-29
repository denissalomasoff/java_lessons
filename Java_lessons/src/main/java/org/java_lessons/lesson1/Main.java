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
        var resultSum = byteVar + intVar;
        var resultMinus = byteVar - intVar;
        var resultMultiply = byteVar * intVar;
        var resultSplit = byteVar / intVar;

        var result1 = floatVar + byteVar;

        // boolean
        boolean b = true;
        boolean c = false;

        // && (И) || (ИЛИ) ! (НЕТ)
        // char
        char d = 'a';

        System.out.println("сумма "+resultSum);
        System.out.println("разница "+resultMinus);
        System.out.println("произвдение "+resultMultiply);
        System.out.println("целочисленное деление "+resultSplit);
        System.out.println("Ярослав - друг, товарищ и брат!");

    }
}
