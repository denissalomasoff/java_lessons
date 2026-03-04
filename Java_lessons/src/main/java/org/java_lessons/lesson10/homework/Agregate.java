package org.java_lessons.lesson10.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agregate {
    public static void main(String[] args) {
        final List<Integer> numberList = new ArrayList<>(10);
        numberList.add(-3);
        numberList.add(5);
        numberList.add(-7);
        numberList.add(10);
        numberList.add(11);
        double sum = 0;

        for (int i = 0; i < numberList.size(); i++) {
            sum = sum + numberList.get(i);
        }
        //Найти минимальное и макисмальное значение в списке numberList;
        double min = Collections.min(numberList);
        double max = Collections.max(numberList);
        double avg = sum / numberList.size();

        System.out.println("--- С использованием Collections ---");
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + avg);
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
    }
}

