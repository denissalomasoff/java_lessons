package org.java_lessons.stepikLessons;
//На вход подаётся последовательность слов. Посчитайте общее количество введённых слов.
import java.util.Scanner;
class MyTest4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (scanner.hasNext()) {
            String word = scanner.nextLine();;
            sum = sum + 1;
        }
        System.out.print("Сумма " +sum);
        scanner.close();
    }
}
