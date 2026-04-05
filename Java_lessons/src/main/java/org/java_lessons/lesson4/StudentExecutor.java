package org.java_lessons.lesson4;

public class StudentExecutor {
    public static void main(String[] args) {
        Student chimic = new StudentChemistryFaculty("Химия", 1, 1, "Катя");
        Student historic = new StudentHistoryFaculty("История", 4, 2.0, "Вова");
        Student math = new StudentMathFaculty("Математика", 3, 4, "Лёня");
        Student phisic = new StudentPhysicsFaculty("Физика", 2, 5, "Сергей");

        System.out.println(chimic.getSubject()+" "+"Курс:"+chimic.getCourse()+" "+"Имя:"+chimic.getName()+" "+"Уровень:"+chimic.getAverageGrade());
        System.out.println(historic.getSubject()+" "+"Курс:"+historic.getCourse()+" "+"Имя:"+historic.getName()+" "+"Уровень:"+historic.getAverageGrade());
        System.out.println(math.getSubject()+" "+"Курс:"+math.getCourse()+" "+"Имя:"+math.getName()+" "+"Уровень:"+math.getAverageGrade());
        System.out.println(phisic.getSubject()+" "+"Курс:"+phisic.getCourse()+" "+"Имя:"+phisic.getName()+" "+"Уровень:"+phisic.getAverageGrade());
    }
}
