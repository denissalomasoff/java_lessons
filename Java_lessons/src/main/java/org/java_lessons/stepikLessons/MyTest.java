package org.java_lessons.stepikLessons;

import java.util.Scanner;

class MyTest {
    public static void main(String[] args) {
        String name1 = "Джефф Безос";
        String name2 = "Илон Маск";
        String name3 = "Марк Цукерберг";
        String name4 = "Билл Гейтс";
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        if ((a.contains(name1))||(a.contains(name2))||(a.contains(name3))||(a.contains(name4))) {
            System.out.println("Добро пожаловать!");
        } else {
            System.out.println("Здесь никого нет, Вы ошиблись дверью");
        }

        sc.close();
    }
}
