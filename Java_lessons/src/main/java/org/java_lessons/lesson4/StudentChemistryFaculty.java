package org.java_lessons.lesson4;

public class StudentChemistryFaculty extends Student {

    public StudentChemistryFaculty(String subject, int course, double averageGrade, String name) {
        super(subject, course, averageGrade, name);
        Student chimic = new StudentChemistryFaculty("Химия", 1, 1.0, "Катя");
    }
}

