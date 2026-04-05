package ru.lessons.lesson6.step3;

import ru.lessons.lesson6.step1.Status;

import java.util.Scanner;

import static ru.lessons.lesson6.step1.Status.ERROR;
import static ru.lessons.lesson6.step1.Status.SUCCESS;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя: ");
        final String name = sc.nextLine();
        System.out.print("Введите свой возраст: ");
        final int age = sc.nextInt();

        if (age < 0) {
            print(" Ввод данных", ERROR, name);
        } else if (age < 7) {
            print(" только в садик", SUCCESS, name);
        } else if (age > 7 && age < 17) {
            print(" пора в школу", SUCCESS, name);
        } else if (age > 18 && age < 60) {
            print(" иди работай", SUCCESS,  name);
        } else {
            print(" пора в поликлинику", SUCCESS, name);
        }

        sc.close();
    }

    private static void print(String message, Status status,  String name) {
        System.out.printf("%s %s %s", status, name, message);
    }
}
