package org.java_lessons.lesson4;

import java.util.Scanner;

public class EmployeeExecutor {
    public static void main(String[] args) {
        Employee1 qa1 = new QAImpl(1200, "KOULKO-1488", "Andrey");
        Employee1 qa2 = new QAImpl(1250, "KOULKP-2765", "Gennady");
        Employee1 sa1 = new SAImpl(1350, "KOULKP-2005", "Olga");
        Employee1 ba1 = new BAImpl(2150, "KOULMSFO-2765", "Fedor");
        Employee1 dev1 = new DevImpl(2450, "KOULMSFO-1765", "Misha");
        Employee1 dev2 = new DevImpl(2400, "KOULMSFO-1363", "Katya");

        dev1.setTask("Refactoring");
        dev1.setTask("UnitTest");
        qa1.setTask("bag-reporting");


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите порядковый номер трудяги от 1 до 6:");
        int choice = sc.nextInt();
        Employee1 specialist;

        if (choice == 1) specialist = qa1;
        else if (choice == 2) {
            specialist = qa2;
        } else if (choice == 3) {
            specialist = sa1;
        } else if (choice == 4) {
            specialist = ba1;
        } else if (choice == 5) {
            specialist = dev1;
        } else if (choice == 6) {
            specialist = dev2;
        } else {
            System.out.println("Ты шо, балбес?! Доступны номера от 1 до 6");
            return;
        }

        System.out.println("ЗП: " +specialist.getSalary() + " рябчиков");
        System.out.println("В работе: " +specialist.getTask());
        System.out.println("Имя трудяги " +specialist.getName());
        //selectedCar.moving();
        //selectedCar.loading();
        sc.close();

    }
}
