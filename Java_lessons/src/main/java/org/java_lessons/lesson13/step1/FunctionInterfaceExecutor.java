package org.java_lessons.lesson13.step1;

import ru.lessons.lesson11.step4.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FunctionInterfaceExecutor {
    public static void main(String[] args) {
        // void
        Consumer<Student> consumer = x -> x.setAge(x.getAge() + 10);

        final var student1 = new Student(UUID.randomUUID(), "Julia", 24, LocalDate.of(2002, 1, 2));
        final var student2 = new Student(UUID.randomUUID(), "Anastasia", 31, LocalDate.of(95, 3, 11));
        final var student3 = new Student(UUID.randomUUID(), "Vlad", 27, LocalDate.of(1999, 4, 15));
        final var student4 = new Student(UUID.randomUUID(), "Andrey", 20, LocalDate.of(2006, 6, 19));
        final var student5 = new Student(UUID.randomUUID(), null, 24, LocalDate.of(2001, 7, 22));
        List<Student> students = new ArrayList<>(List.of(student1, student2, student3, student4, student5));

        students.forEach(consumer);

        Supplier<Student> studentSupplier = () -> {
            return student1;
        };

        Predicate<Student> predicate = st -> st.getAge() > 30;

        final var studentsFiltered = students.stream()
                .filter(st -> st.getAge() > 30)
                .toList();

        System.out.println(studentsFiltered);
        Function<Student, Integer> function = student -> student.getName().length();

        final var nameLength = students.stream()
                .filter(student -> student.getName() != null)
                .map(student -> student.getName().length())
                .toList();

        System.out.println(nameLength);

//       Optional.of(student5)
//                .map(student -> student.getName())
//                .orElseThrow(() -> new IllegalStateException("Error"));

       final var name = Optional.of(student5)
                .map(student -> student.getName())
                .orElse("Unknown");

       final var studentNameStartsWithA = students
               .stream()
               .filter(student -> student.getName() != null && student.getName().startsWith("B"))
               .findFirst()
               .orElse(student4);
        System.out.println(studentNameStartsWithA);

        final var anyNamesNonNull = students.stream().anyMatch(st -> st.getName() != null); // true
        final var allNamesNonNull = students.stream().allMatch(st -> st.getName() != null); // false
        final var namesNonNull = students.stream().noneMatch(st -> st.getName() != null); // false

        Stream<Student> stream = Stream.of(student1, student2, student3, student4, student5);
    }
}
