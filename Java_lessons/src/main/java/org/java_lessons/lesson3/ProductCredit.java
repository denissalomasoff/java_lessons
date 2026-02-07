package org.java_lessons.lesson3;

import java.util.UUID;

//создаем класс ProductCredit
public class ProductCredit {
    private UUID id;
    private String Number;
    private boolean isActive;
    private String arrangement;
    private double rate;

    //создаем пустой конструктор
    public ProductCredit() {
    }

    //создаем пустой консттруктор с параметрами
    public ProductCredit(UUID id, String number, boolean isActive, String arrangement, double rate) {
        this.id = id;
        Number = number;
        this.isActive = isActive;
        this.arrangement = arrangement;
        this.rate = rate;

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getArrangement() {
        return arrangement;
    }

    public void setArrangement(String arrangement) {
        this.arrangement = arrangement;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }


}
