package org.java_lessons.stepikLessons;
//Считайте со ввода последовательность целых чисел. Последовательность оканчивается числом 0.
//
//Выведите на печать сумму введённых чисел.
import java.util.Scanner;
class MyTest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n = 1;
        while (n!=0) {
            n = scanner.nextInt();
            sum = sum + n;
        }
        System.out.print("Сумма " +sum);
    }
}
