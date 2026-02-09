package org.java_lessons.lesson5.step3;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class SmartPhone {
    private UUID id;
    private String model;
    private String manufacturer;
    private double price;
    private LocalDateTime startOfSale;

    public SmartPhone() {
    }

    public SmartPhone(String model,
                      String manufacturer,
                      double price) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
        this.id = UUID.randomUUID();
        this.startOfSale = LocalDateTime.now();
    }
    // Getters для всех полей
    public UUID getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public LocalDateTime getStartOfSale() {
        return startOfSale;
    }

    // Setters только для цены
    public void setPrice(double price) {
        this.price = price;
    }

    // переопределяем метод toString() унаследован по default
    // у родителя всех классов class Object
    @Override
    public String toString() {
        return "SmartPhone{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", startOfSale=" + startOfSale +
                '}';
    }

    // переопределяем метод equals(Object o) сравнение объектов
    // унаследован по default
    // у родителя всех классов class Object
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhone that = (SmartPhone) o;
        return Double.compare(price, that.price) == 0 && Objects.equals(model, that.model) && Objects.equals(manufacturer, that.manufacturer);
    }

    // переопределяем метод hashCode() используется в Hash коллекциях
    // унаследован по default
    // у родителя всех классов class Object
    @Override
    public int hashCode() {
        return Objects.hash(model, manufacturer, price);
    }
}
