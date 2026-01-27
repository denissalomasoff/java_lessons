package org.java_lessons.lesson1;

public class Main {
    public static void main(String[] args) {
        // Числа
        byte byteVar = 1;
        short shortVar = 2;
        int intVar = 3;
        long longVar = 4;

        //float
        float floatVar = 123.45f;
        double doubleVar = 1122.33d;

        var number = 1234;
        //+ - * / %
        var result = byteVar - intVar;

        var result1 = floatVar + byteVar;

        // boolean
        boolean b = true;
        boolean c = false;

        // && (И) || (ИЛИ) ! (НЕТ)
        // char
        char c = 'a';

        System.out.println(result1);
    }
}
