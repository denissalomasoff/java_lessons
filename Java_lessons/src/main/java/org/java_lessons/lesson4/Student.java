package org.java_lessons.lesson4;

//2. Создать абстрактный класс Student с полями:
//a) String name;
//b) String subject;
//c) int course;
//d) double averageGrade;
//2.1. создать для всех полей Getters and Setters;
//2.2. Создать конструктор без и со всеми параметрами;
//2.3. Реализовать классы (студент физического факультета StudentPhysicsFaculty, StudentChemistryFaculty, StudentMathFaculty, StudentHistoryFaculty) наследующие абстрактный класс Student;
//2.4. В классе StudentExecutor создать все 4 вида студентов и вывести все данные о них;

public abstract class Student {
   public String name;
   public String subject;
   public int course;
   public double averageGrade;

    public Student(String subject, int course, double averageGrade, String name) {
        this.subject = subject;
        this.course = course;
        this.averageGrade = averageGrade;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}
