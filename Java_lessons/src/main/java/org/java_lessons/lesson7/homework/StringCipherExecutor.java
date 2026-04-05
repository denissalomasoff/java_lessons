package org.java_lessons.lesson7.homework;

import java.util.Scanner;

public class StringCipherExecutor {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сначала строку, а затем смещение (offset)");
        // создается экземпляр класса StringCipher, для обращения к классу и возможности вызова метода этого класса
        final StringCipher stringCipher = new StringCipher();
        // переменной resultDecode присваивается значение, полученное из метода decode,
        // который принимает входящую строку и значени из Сканнера
        final String inputString = scanner.nextLine();
        System.out.println("Введите offset");
        final Integer offset = scanner.nextInt();
        scanner.nextLine();
        final String resultDecode = stringCipher.decode(inputString, offset);
        System.out.println("Результат шифрования строки: " + resultDecode);
        scanner.close();
    }
}

