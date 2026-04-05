package ru.lessons.lesson10.step1;

import java.util.Arrays;
import java.util.Random;

public class ArraysExecutor {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 5));
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10);
        }
    }
}
