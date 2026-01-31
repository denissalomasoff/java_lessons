package org.java_lessons.lesson2;

import java.util.Scanner;

public class Cars {
    public static void main(String[] args) {
        Auto car1 = new Auto("Mercedes", "Diesel", 170, "White", 20000);
        Auto car2 = new Auto("Toyota", "Petrol", 181, "Black", 18000);
        Auto car3 = new Auto("Scoda", "Petrol", 200, "Blue", 17500);
        Auto car4 = new Auto("Lexus", "Petrol", 205, "White", 21400);
        Auto car5 = new Auto("Uaz", "Petrol");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер автомобиля от 1 до 5:");
        int choice = sc.nextInt();
        Auto selectedCar;

        if (choice == 1) {
            selectedCar = car1;
        } else if (choice == 2) {
            selectedCar = car2;
        } else if (choice == 3) {
            selectedCar = car3;
        } else if (choice == 4) {
            selectedCar = car4;
        } else if (choice == 5) {
            selectedCar = car5;
        } else {
            System.out.println("Ошибка ввода. Доступны номера от 1 до 5");
            sc.close();
            return;
        }

            System.out.println(selectedCar.brand);
            System.out.println(selectedCar.engine);
            System.out.println(selectedCar.capacity);
            System.out.println(selectedCar.color);
            System.out.println(selectedCar.price);
           // sc.close();
        }
    }


