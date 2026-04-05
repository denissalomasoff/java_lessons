package ru.lessons.lesson8.step2;

import java.util.Random;

public class AggregationFunStaticMethodsRunner {
    public static void main(String[] args) {
        final int[] arr = new int[20];
        fillArray(arr);
        printArray(arr);
        System.out.println("Сумма массива = " + sum(arr));
        System.out.println("Минимальное значение = " + min(arr));
        System.out.println("Максимальное значение = " + max(arr));
        System.out.println("Среднее значение = " + avg(arr));
    }

    // заполнить массив
    private static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int number : arr) {
            System.out.print(number + ", ");
        }
        System.out.print("]");
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    private static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    private static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static double avg(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return ((double) sum) / arr.length;
    }
}
