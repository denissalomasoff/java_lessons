package org.java_lessons.lesson10.homework;

import java.util.ArrayList;
import java.util.List;

public class ListReverse {
    public static void main(String[] args) {
        final List<Integer> numberList = new ArrayList<>(10);
        numberList.add(3);
        numberList.add(5);
        numberList.add(7);
        numberList.add(10);
        numberList.add(11);
        // Цикл увеличивает i, пока i меньше 2 (ListSize => 5/2 => 2));
        for (int i = 0; i < numberList.size() / 2; i++) {
            int j = numberList.size() - 1 - i; // индекс симметричного элемента с конца, то есть перебор списка в обратном направлении;

            // Обмен значений через индексы
            Integer swap = numberList.get(i);
            numberList.set(i, numberList.get(j));
            numberList.set(j, swap);
        }

        System.out.println("Развернутый список: " + numberList);

    }
}
