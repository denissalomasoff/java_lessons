package org.java_lessons.lesson4;

public interface Car {

    void loading();
    void moving();

    String getModel();
    String getColor();
    double getPrice();

    void setModel(String model);
    void setColor(String color);
    void setPrice(double price);

}

