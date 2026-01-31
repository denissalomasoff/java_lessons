package org.java_lessons.lesson2;

public class Home {
    String address;
    int height;
    int width;
    double cost;

    public Home() {
    }

    public Home(String address, int height, int width, double cost) {
        this.address = address;
        this.height = height;
        this.width = width;
        this.cost = cost;
    }

    public Home(String address, int height, int width) {
        this.address = address;
        this.height = height;
        this.width = width;
    }

    public Home(String address, double cost) {
        this.address = address;
        this.cost = cost;
    }

    public Home(String address) {
        this.address = address;
    }

    public Home(double cost) {
        this.cost = cost;
    }
}
