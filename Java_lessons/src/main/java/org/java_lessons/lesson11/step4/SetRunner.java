package ru.lessons.lesson11.step4;

import java.time.LocalDate;
import java.util.*;

public class SetRunner {
    public static void main(String[] args) {
        final Set<Integer> set = new HashSet<>();
        set.add(11);
        set.add(22);
        set.add(33);
        final var contained = set.contains(4); // false
        System.out.println(set);

        final var student1 = new ru.lessons.lesson11.step4.Student(UUID.randomUUID(), "Ivan", 33, LocalDate.of(2000, 1, 2));
        final var student2 = new ru.lessons.lesson11.step4.Student(UUID.randomUUID(), "John", 22, LocalDate.of(1980, 1, 2));
        final var student3 = new ru.lessons.lesson11.step4.Student(UUID.randomUUID(), "Petr", 44, LocalDate.of(2001, 1, 2));
        final var students = new HashSet<>(List.of(student1, student2, student3));
        final var arr = students.toArray(ru.lessons.lesson11.step4.Student[]::new);
        final var student1Copy = new ru.lessons.lesson11.step4.Student(UUID.randomUUID(), "Ivan", 33, LocalDate.of(1960, 1, 2));
        final var exists = students.contains(student1Copy); // false если не реализовать equals() и hashCode в Student
        System.out.println("Множество = " + students);
        students.add(student1Copy); // дубликат если не реализовать equals() и hashCode в Student

        final Set<ru.lessons.lesson11.step4.Student> studentsLinkedList = new LinkedHashSet<>();
        studentsLinkedList.add(student1);
        studentsLinkedList.add(student2);
        studentsLinkedList.add(student3);
        System.out.println("Связанное множество = " + studentsLinkedList);

        List<String> list = List.of("2", "3");

        Set<ru.lessons.lesson11.step4.Student> studentsSet = new TreeSet<>(new ru.lessons.lesson11.step4.StudentBirthDayComparator());
        studentsSet.addAll(List.of(student1, student2, student3, student1Copy, student2, student3));
        System.out.println(studentsSet);

    }
}
