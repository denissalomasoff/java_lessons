package org.java_lessons.lesson8.homework;

public class EvenAndOdd {
    public static void main(String[] args) {
        final int[] testNumbers = {1, 5, 8, 11, 0, -5, 13, 81, 100};
        int testNumbersSum = 0;
        for (int i = 0; i < testNumbers.length; i++) {
            testNumbersSum = testNumbersSum + testNumbers[i];
        }
        //счетчик четных чисел;
        int evenCount = 0;
        //счетчик элементов массива;
        int charCount = 0;
        int evenCountSum = 0;
        int oddCountSum = 0;
        for (int i = 0; i < testNumbers.length; i++) {
            // в цикле перебираем все элементы массива и убираем 0;
            if ((testNumbers[i] != 0) && (testNumbers[i] % 2 == 0)) {
                evenCount = evenCount + 1;
                charCount = i;
                evenCountSum = testNumbers[i] + evenCountSum;
                oddCountSum = testNumbersSum - evenCountSum;
            }
        }
        System.out.println("Количество четных чисел в массиве: " + evenCount);
        System.out.println("Количество нечетных чисел в массиве: " + (charCount - evenCount));
        System.out.println("Сумма четных чисел в массиве: " + evenCountSum);
        System.out.println("Сумма нечетных чисел в массиве: " + oddCountSum);

    }
}

