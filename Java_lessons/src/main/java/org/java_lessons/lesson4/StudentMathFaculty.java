package org.java_lessons.lesson4;

public class StudentMathFaculty extends Student {

    public StudentMathFaculty(String subject, int course, double averageGrade, String name) {
        super(subject, course, averageGrade, name);
        Student math = new StudentMathFaculty("Математика", 3, 4, "Лёня");
    }
}


