package org.java_lessons.lesson6;

import java.time.LocalDate;
import java.time.Month;

public class BestWhichSeason {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Month month = date.getMonth();

        if ((month == month.DECEMBER) || (month == month.JANUARY) || (month == month.FEBRUARY)) {
            System.out.println("Текущая дата: " + date);
            System.out.println("Время года: " + Season.WINTER);
        } else if ((month == month.MARCH) || (month == month.APRIL) || (month == month.MAY)) {
            System.out.println("Текущая дата: " + date);
            System.out.println("Время года: " + Season.SPRING);
        } else if ((month == month.JUNE) || (month == month.JULY) || (month == month.AUGUST)) {
            System.out.println("Текущая дата: " + date);
            System.out.println("Время года: " + Season.SUMMER);
        } else {
            System.out.println("Текущая дата: " + date);
            System.out.println("Время года: " + Season.FALL);
        }
    }
}

