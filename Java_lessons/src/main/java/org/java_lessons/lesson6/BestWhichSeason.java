package org.java_lessons.lesson6;

import java.time.LocalDate;
import java.time.Month;

import static org.java_lessons.lesson6.Season.*;

public class BestWhichSeason {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Month month = date.getMonth();

        if ((month == month.DECEMBER) || (month == month.JANUARY) || (month == month.FEBRUARY)) {
            System.out.println("Текущая дата: " + date);
            System.out.println("Время года: " + WINTER.getRusName());
        } else if ((month == month.MARCH) || (month == month.APRIL) || (month == month.MAY)) {
            System.out.println("Текущая дата: " + date);
            System.out.println("Время года: " + SPRING.getRusName());
        } else if ((month == month.JUNE) || (month == month.JULY) || (month == month.AUGUST)) {
            System.out.println("Текущая дата: " + date);
            System.out.println("Время года: " + SUMMER.getRusName());
        } else {
            System.out.println("Текущая дата: " + date);
            System.out.println("Время года: " + FALL.getRusName());
        }
    }
}

