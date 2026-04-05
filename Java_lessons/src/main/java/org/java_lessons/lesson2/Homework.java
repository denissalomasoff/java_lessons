package org.java_lessons.lesson2;

public class Homework {
    public static void main(String[] args) {
        int number = 12;
        //number в диапазоне [100, 1000]
        boolean res = number >= 100 && number <= 1000;
        //number за пределами диапазона [1, 1000]
        boolean res1 = number < 1 || number > 1000;
        //number только в диапазонах [1, 10] или [100, 300]
        boolean res2 = (number > 1 && number < 10) || (number > 100 && number < 300);
        //number четное;
        boolean res3 = number % 2 == 0;
        //number кратное 3, но не кратное 9;
        boolean res4 = (number % 3 == 0) && (number % 9 != 0);
        //number кратное 5 и 7;
        boolean res5 = (number % 5 == 0) && (number % 7 == 0);
        int age = 18;
        //Вывести взрослый или нет
        boolean isAdult = age >= 18;


        System.out.println("number в диапазоне [100, 1000] : " + res);
        System.out.println("number за пределами диапазона [1, 1000] : " + res1);
        System.out.println("number только в диапазонах [1, 10] или [100, 300] : " + res2);
        System.out.println("number четное : " + res3);
        System.out.println("number кратное 3, но не кратное 9 : " + res4);
        System.out.println("number кратное 5 и 7 : " + res5);
        System.out.println("взрослый : " + isAdult);
    }
}
