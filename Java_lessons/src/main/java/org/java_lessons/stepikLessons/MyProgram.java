package org.java_lessons.stepikLessons;

import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i <= x; i++) {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                System.out.print(i + " ");
            } else {
                System.out.print("Таких чисел нет");
            }
        }
    }
}
