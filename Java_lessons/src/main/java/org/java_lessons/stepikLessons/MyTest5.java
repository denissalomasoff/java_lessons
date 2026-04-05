package org.java_lessons.stepikLessons;

import java.util.Scanner;

//На вход подаются числа, которые делятся на 11. Концом последовательности будет любое число, не делящееся на 11 (это число не входит в последовательность).
//Посчитайте количество введённых чисел и сумму тех из них, которые кратны 3.
class MyTest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;      // счетчик введённых чисел
        int sum = 0;        // сумма чисел, кратных 3

        while (true) {
            int number = scanner.nextInt();  // читаем число

            // проверяем, делится ли число на 11
            if (number % 11 != 0) {
                break;  // если не делится - конец последовательности
            }

            // число входит в последовательность
            count++;

            // проверяем, кратно ли число 3
            if (number % 3 == 0) {
                sum += number;
            }
        }

        System.out.println("Количество: " + count);
        System.out.println("Сумма чисел, кратных 3: " + sum);

        scanner.close();
    }
}


