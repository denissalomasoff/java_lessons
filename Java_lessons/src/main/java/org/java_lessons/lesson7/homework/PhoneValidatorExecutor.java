package org.java_lessons.lesson7.homework;

import java.util.Scanner;

public class PhoneValidatorExecutor {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер телефона");
        // создается экземпляр класса PhoneValidator, для обращения к классу и возможности вызова метода этого класса
        final PhoneValidator phoneValidator = new PhoneValidator();
        // переменной result присваивается значение, полученного из метода validate,
        // который принимает входящую строку из Сканнера
        final boolean result = phoneValidator.validate(scanner.nextLine());
        System.out.println("Результат проверки строки " + result);
        scanner.close();
    }
}
