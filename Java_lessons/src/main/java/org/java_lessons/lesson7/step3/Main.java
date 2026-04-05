package ru.lessons.lesson7.step3;

public class Main {
    public static void main(String[] args) {
        // Цикл fori
        final var str = "Hello world";
        final String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Элемент массива = " + arr[i]);
        }
        System.out.println("*".repeat(30));
        // Цикл for
        for (char chr : str.toCharArray()) {
            System.out.println("Символ в строке = " + chr);
        }
        System.out.println("*".repeat(30));
        // Цикл while
        int i = 0;
        while (i < arr.length) {
            System.out.println("Элемент массива = " + arr[i]);
            i++;
        }

        // Цикл do while
        System.out.println("*".repeat(30));
        int j = 0;
        do {
            System.out.println("Элемент массива = " + arr[j]);
            j++;
        } while (j < arr.length);

        System.out.println("*".repeat(30));
        // Перебор матрицы
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] row : matrix) {
            for (int col : row) {
                System.out.println("Значение элемента матрицы = " + col);
            }
        }

        for (int k = 0; k < matrix.length; k++) {
            System.out.println();
            for (int l = 0; l < matrix.length; l++) {
                System.out.print(matrix[k][l]);
            }
        }
    }
}
