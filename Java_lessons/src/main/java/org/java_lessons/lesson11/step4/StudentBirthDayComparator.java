package ru.lessons.lesson11.step4;

import java.util.Comparator;

public class StudentBirthDayComparator implements Comparator<ru.lessons.lesson11.step4.Student> {
    @Override
    public int compare(ru.lessons.lesson11.step4.Student o1, ru.lessons.lesson11.step4.Student o2) {
        if (o1.getDateOfBirth().isAfter(o2.getDateOfBirth())) {
            return -1;
        } else if (o1.getDateOfBirth().isBefore(o2.getDateOfBirth())) {
            return 1;
        }
        return 0;
    }
}
