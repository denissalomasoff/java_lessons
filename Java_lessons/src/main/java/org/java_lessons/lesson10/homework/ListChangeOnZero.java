package org.java_lessons.lesson10.homework;

import java.util.ArrayList;
import java.util.List;

public class ListChangeOnZero {
    public static void main(String[] args) {
        final List<Integer> numberList = new ArrayList<>(10);
        numberList.add(-3);
        numberList.add(5);
        numberList.add(-7);
        numberList.add(10);
        numberList.add(11);

        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i) < 0) {
                numberList.set(i, 0);
            }
        }
        System.out.println("Отрицательные элементы заменены на 0/zero/дырка_от_бублика " + numberList);
    }
}