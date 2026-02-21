package org.java_lessons.lesson7.homework;

import java.util.Scanner;

public class PhoneValidator {
    final String number;

    public PhoneValidator(String number) {
        this.number = number;
    }
//       public boolean validate(String splitNumber){
//           if (splitNumber.isEmpty()) {
//                return false;
//           }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер телефона");
        String number = sc.nextLine().trim().replaceAll("[a-z\\s\\-_]", "");// убираем символы кроме цифр
        final String[] splitNumber = number.split("");// после удаления и склейки цифр из номера, разбиваем строку на символы

        if (number.isEmpty()) {
            System.out.println("Номер не введен, повторите попытку.");
        } else if (((splitNumber[0].equals("+")) && (splitNumber.length == 12)) ||
            (splitNumber[0].equals("7")) && (splitNumber.length == 11) ||
            (splitNumber[0].equals("8") && (splitNumber.length == 11))) {
            System.out.println("Номер принадлежит российскому оператору");
        } else if (number.length() > 20) {
            System.out.println("Номер содержит более 20 символов, повторите ввод");
        } else {
            System.out.println("Номер НЕ ПРИНАДЛЕЖИТ российскому оператору");
        }
    }
}
