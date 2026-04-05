package org.java_lessons.lesson2;

public class Auto {
    String brand;
    String engine;
    int capacity;
    String color;
    double price;

    public Auto(String brand, String engine, int capacity, String color, double price) {
        this.brand = brand;
        this.engine = engine;
        this.capacity = capacity;
        this.color = color;
        this.price = price;
    }

    public Auto() {
    }

    public Auto(String brand) {
        this.brand = brand;
    }

    public Auto(String brand, String engine) {
        this.brand = brand;
        this.engine = engine;
    }

    public Auto(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Auto(String brand, String engine, double price) {
        this.brand = brand;
        this.engine = engine;
        this.price = price;
    }


}