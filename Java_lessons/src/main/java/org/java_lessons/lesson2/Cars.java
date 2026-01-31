package org.java_lessons.lesson2;

import java.util.Scanner;

public class Cars {
    public static void main(String[] args) {
        Auto car1 = new Auto();
            car1.brand = "Mercedes";
            car1.engine = "Diesel";
            car1.capacity = 170;
            car1.color = "White";
            car1.price = 20000;

        Auto car2 = new Auto();
            car2.brand = "Toyota";
            car2.engine = "Petrol";
            car2.capacity = 181;
            car2.color = "Black";
            car2.price = 18000;

        Auto car3 = new Auto();
            car3.brand = "Skoda";
            car3.engine = "Petrol";
            car3.capacity = 200;
            car3.color = "Blue";
            car3.price = 17500;

        Auto car4 = new Auto("Lexus", "Petrol", 205, "White", 21400);
        Auto car5 = new Auto("Uaz", "Petrol");


        System.out.println(car2.brand);
        System.out.println(car2.engine);
        System.out.println(car2.capacity);
        System.out.println(car2.color);
        System.out.println(car2.price);
    }
}
