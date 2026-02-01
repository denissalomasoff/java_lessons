package org.java_lessons.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //> < >= <= !=
        int num1 = 10;
        int num2 = 20;
        boolean res = num1 < num2;
        //System.out.println(res);
        // И || | +
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = b1 || b2; // = true
        //           1 * 0 = 0
        boolean b4 = b1 && b2;
        boolean b5 = !b1;
        //           1    0 = 1
        boolean b6 = b1 ^ b2;

        //Scanner sc = new Scanner(System.in);
        //String number = sc.nextLine();
        //Integer integer = Integer.valueOf(number);
        //System.out.println("Парное число = " + (integer % 2 == 0 ? "парное" : "непарное"));

        // ++ -- += -= *= /= %=
        System.out.println(num1++);
        System.out.println(num1);

    }
}
