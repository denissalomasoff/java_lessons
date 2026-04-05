package org.java_lessons.lesson7.homework;

import java.util.Scanner;

public class PhoneValidator {
    // метод принимает на вход строку с любым наименованием (рандомНаймСтринг) - любое название переменной
    public boolean validate(String randomNameString) {
        boolean result = false;
        if (randomNameString == null || randomNameString.isEmpty()) {
            System.out.println("Строка пустая");
            return result;
        }
        final String number = randomNameString.trim().replaceAll("[a-z\\s\\-_]", "");// убираем символы кроме цифр
        final String[] splitNumber = number.split("");// после удаления и склейки цифр из номера, разбиваем строку на символы

        if (((splitNumber[0].equals("+")) && (splitNumber.length == 12)) ||
                (splitNumber[0].equals("7")) && (splitNumber.length == 11) ||
                (splitNumber[0].equals("8") && (splitNumber.length == 11))) {
            System.out.println("Номер принадлежит российскому оператору");
            result = true;
        } else if (number.length() > 20) {
            System.out.println("Номер содержит более 20 символов, повторите ввод");
            result = false;
        } else {
            System.out.println("Номер НЕ ПРИНАДЛЕЖИТ российскому оператору");
            result = false;
        }
        return result;
    }
}