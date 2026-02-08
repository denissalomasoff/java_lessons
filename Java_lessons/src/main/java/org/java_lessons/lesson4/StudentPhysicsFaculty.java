package org.java_lessons.lesson4;

public class StudentPhysicsFaculty extends Student {

    public StudentPhysicsFaculty(String subject, int course, double averageGrade, String name) {
        super(subject, course, averageGrade, name);
    }

    public static void main(String[] args) {
        Student phisic = new StudentPhysicsFaculty("Физика", 2, 5, "Сергей");
    }
}
