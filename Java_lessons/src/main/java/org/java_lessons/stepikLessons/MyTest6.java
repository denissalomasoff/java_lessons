package org.java_lessons.stepikLessons;

import java.util.Scanner;

//На вход подаётся последовательность чисел от нуля до 10, являющихся рейтингами фильма, выставленными зрителями.
// Если входящее число отрицательное или больше 10, последовательность прерывается.
//Посчитайте среднюю оценку фильма.
class MyTest6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;      // счетчик введённых чисел
        int sum = 0;        // сумма чисел, кратных 3

        while (true) {
            int number = scanner.nextInt();  // читаем число

            // проверяем, отрицательное число или больше 10
            if ((number > 10)||(number < 0)) {
                break;  // если не делится - конец последовательности
            }

            // число входит в последовательность
            count++;
            sum = sum + number;

        }
        double average = (double) sum / count;
        System.out.println("Количество: " + count);
        System.out.println("Сумма чисел, кратных 3: " + sum);
        System.out.println("Среднее: " + average);

        scanner.close();
    }
}


