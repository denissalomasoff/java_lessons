package org.java_lessons.lesson4;

public class CarImpl implements Car {
    private String model;
    private String color;
    private double price;

    public CarImpl() {
    }

    public CarImpl(String model, double price, String color) {
        this.model = model;
        this.price = price;
        this.color = color;
    }

    @Override
    public void loading() {
        System.out.println("Машина на погрузке " + model);
    }

    @Override
    public void moving() {
        System.out.println("Машина в пути "  + model);
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
