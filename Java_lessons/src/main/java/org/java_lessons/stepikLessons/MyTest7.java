package org.java_lessons.stepikLessons;

import java.util.Scanner;

//На вход подаётся натуральное число. Выведите на печать составляющие его цифры в обратном порядке.
class MyTest7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long number = scanner.nextLong();  // читаем натуральное число

        // обрабатываем случай, когда число равно 0
        if (number == 0) {
            System.out.println(0);
        } else {
            // пока число больше 0, извлекаем последнюю цифру
            while (number > 0) {
                Long digit = number % 10;  // получаем последнюю цифру
                System.out.print(digit);   // выводим цифру
                number = number / 10;      // отбрасываем последнюю цифру
            }
        }

        scanner.close();
    }
}