package org.java_lessons.lesson6;

import java.time.LocalDate;

public class WhichSeason {
    public static void main(String[] args) {
        final LocalDate date = LocalDate.now();
        final String convertDate = date.toString();
        final char char1 = convertDate.charAt(5);
        final char char2 = convertDate.charAt(6);
        //Season = Season.FALL;

        System.out.println(convertDate);
        System.out.println(char1 + " " + char2);

        if ((char1 == 0) && (char2 == 1)) {
            System.out.println("Текущая дата: " + date);
            System.out.println("Время года: " + "Зима");
        } else if ((char1 == 0) && (char2 == 2)) {
            System.out.println("Текущая дата: " + date);
            System.out.println("Время года: " + "Зима");
        } else if ((char1 == 0) && (char2 == 3)) {
            System.out.println("Текущая дата: " + date);
            System.out.println("Время года: " + "Весна");
        } else if ((char1 == 0) && (char2 == 4)) {
            System.out.println("Текущая дата: " + date);
            System.out.println("Время года: " + "Весна");
        } else if ((char1 == 0) && (char2 == 5)) {
            System.out.println("Текущая дата: " + date);
            System.out.println("Время года: " + "Весна");
        } else if ((char1 == 0) && (char2 == 6)) {
            System.out.println("Текущая дата: " + date);
            System.out.println("Время года: " + "Лето");
        } else if ((char1 == 0) && (char2 == 7)) {
            System.out.println("Текущая дата: " + date);
            System.out.println("Время года: " + "Лето");
        } else if ((char1 == 0) && (char2 == 8)) {
            System.out.println("Текущая дата: " + date);
            System.out.println("Время года: " + "Лето");
        } else if ((char1 == 0) && (char2 == 9)) {
            System.out.println("Текущая дата: " + date);
            System.out.println("Время года: " + "Осень");
        } else if ((char1 == 1) && (char2 == 0)) {
            System.out.println("Текущая дата: " + date);
            System.out.println("Время года: " + "Осень");
        } else if ((char1 == 1) && (char2 == 1)) {
            System.out.println("Текущая дата: " + date);
            System.out.println("Время года: " + "Осень");
        } else {
            System.out.println("Текущая дата: " + date);
            System.out.println("Время года: " + "Зима");
        }
    }
}