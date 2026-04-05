package org.java_lessons.lesson4;

import java.util.Scanner;

public class CarExecutor {
    public static void main(String[] args) {
        Car mercedes = new CarImpl("Mercedes", 18000, "Red");
        Car renault = new CarImpl("Renault", 19000, "Blue");
        Car man = new CarImpl("Man", 18000, "Yellow");

        mercedes.setColor("Green");
        man.setModel("Daf");
        man.setPrice(20000);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер автомобиля от 1 до 3:");
        int choice = sc.nextInt();
        Car selectedCar;

        if (choice == 1) selectedCar = mercedes;
        else if (choice == 2) {
            selectedCar = renault;
        } else if (choice == 3) {
            selectedCar = man;
        } else {
            System.out.println("Ошибка ввода. Доступны номера от 1 до 3");
            return;
        }

        System.out.println(selectedCar.getModel());
        System.out.println(selectedCar.getColor());
        System.out.println(selectedCar.getPrice());
        selectedCar.moving();
        selectedCar.loading();
        sc.close();
    }
}
