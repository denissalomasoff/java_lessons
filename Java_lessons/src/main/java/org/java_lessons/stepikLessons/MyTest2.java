package org.java_lessons.stepikLessons;

import java.util.Scanner;

public class MyTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        switch (word.length()) {
            case 1:
                System.out.println("Одна буква");
                break;
            case 2:
                System.out.println("Две буквы");
                break;
            case 3:
                System.out.println("Три буквы");
                break;
            case 4:
                System.out.println("Четыре буквы");
                break;
            case 5:
                System.out.println("Пять букв");
                break;
            default:
                System.out.println("Длинное слово");
                break;
        }
        sc.close();
    }
}


