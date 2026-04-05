package ru.lessons.lesson7.step2;

import java.util.Arrays;

public class ArraysExecutor {
    public static void main(String[] args) {
        final int[] numbers = new int[10];
        final int[] anotherNumbers = {1, 2, 3, 4, 5};
        final var number = numbers[0];
        System.out.println("numbers[0] = " + numbers[0]);
        anotherNumbers[0] = 100;
        System.out.println(Arrays.toString(anotherNumbers)); // [100, 2, 3, 4, 5]

        System.out.println("Длина numbers = " + numbers.length); // 10
        System.out.println("Длина anotherNumbers = " + anotherNumbers.length); // 5

        // Копирование массива:
        int[] copy = new int[numbers.length];
        System.arraycopy(numbers, 0, copy, 0, numbers.length);
        System.out.println(Arrays.toString(copy)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        copy = Arrays.copyOf(anotherNumbers, numbers.length);

        System.out.println(Arrays.toString(copy)); // [100, 2, 3, 4, 5, 0, 0, 0, 0, 0]

        // Матрица
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(matrix[0][0]); // 1
    }
}
