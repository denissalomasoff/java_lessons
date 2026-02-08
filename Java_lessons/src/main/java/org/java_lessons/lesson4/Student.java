package org.java_lessons.lesson4;

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
