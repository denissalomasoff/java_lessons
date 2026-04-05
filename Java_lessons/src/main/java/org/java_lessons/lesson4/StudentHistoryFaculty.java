package org.java_lessons.lesson4;

public class StudentHistoryFaculty extends Student {

    public StudentHistoryFaculty(String subject, int course, double averageGrade, String name) {
        super(subject, course, averageGrade, name);
        Student historic = new StudentHistoryFaculty("История", 4, 2.0, "Вова");
    }
}

