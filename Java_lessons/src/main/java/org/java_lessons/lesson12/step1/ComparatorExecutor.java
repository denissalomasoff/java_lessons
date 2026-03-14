package ru.lessons.lesson12.step1;

import ru.lessons.lesson11.step4.Student;

import java.time.LocalDate;
import java.util.*;

public class ComparatorExecutor {
    public static void main(String[] args) {
        final var student1 = new Student(UUID.randomUUID(), "Julia", 24, LocalDate.of(2002, 1, 2));
        final var student2 = new Student(UUID.randomUUID(), "Anastasia", 31, LocalDate.of(95, 3, 11));
        final var student3 = new Student(UUID.randomUUID(), "Vlad", 27, LocalDate.of(1999, 4, 15));
        final var student4 = new Student(UUID.randomUUID(), "Andrey", 20, LocalDate.of(2006, 6, 19));
        final var student5 = new Student(UUID.randomUUID(), "Gleb", 24, LocalDate.of(2001, 7, 22));
        List<Student> students = new ArrayList<>(List.of(student1, student2, student3, student4, student5));

        students.sort(Comparator.comparing(Student::getName).thenComparing(Student::getAge));
        System.out.println(students);
        students.sort(Comparator.comparing(Student::getAge, Comparator.nullsFirst(Comparator.reverseOrder())));
        System.out.println(students);
    }
}
