package org.java_lessons.stepikLessons;

import java.util.Scanner;

//На вход подаётся строка с двумя буквами, а затем - строка, состоящая из слов.
//Выведите на печать все слова, которые начинаются на буквы, идущие по алфавиту между буквами с первой строки (включительно).
//Вывести слова необходимо в том же порядке, в котором они подаются на вход.
class MyTest8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  читаем следующее слово (строку до пробела)
        String char1 = scanner.next();
        String char2 = scanner.next();
        // берём первый символ из строки (букву) и преобразуем в числовой код ASCII
        int x = char1.charAt(0);
        int y = char2.charAt(0);

        while (scanner.hasNext()) {
            String word = scanner.next();
            if ((word.charAt(0) >= x) && (word.charAt(0) <= y)) {
                System.out.println(word);
            }
        }
    }
}
