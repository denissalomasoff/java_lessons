package ru.lessons.lesson8.step2;

import java.util.Random;

public class AggregationFunNonStaticMethodsRunner {
    public static void main(String[] args) {
        final int[] arr = new int[30];
        final var runner = new AggregationFunNonStaticMethodsRunner();
        runner.fillArray(arr);
        runner.printArray(arr);
        System.out.println("Сумма массива = " + runner.sum(arr));
        System.out.println("Минимальное значение = " + runner.min(arr));
        System.out.println("Максимальное значение = " + runner.max(arr));
        System.out.println("Среднее значение = " + runner.avg(arr));
    }

    // заполнить массив
    public void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }
    }

    private void printArray(int[] arr) {
        System.out.print("[");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.print("]");
    }

    private int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    private int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    private int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private double avg(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return ((double) sum) / arr.length;
    }
}
