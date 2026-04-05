package org.java_lessons.lesson5.homework;
//д/з 1. Создать класс Computer (int id, String cpu, int ram, String videoCard, int power),
// переопределить методы equlals(), toString(), hashCode(), реализуйте 3 версии класса (x,y,z);
//2. Проверить правильность переопределения метода equlals():
//a) Рефлексивность: x.equals(x) должен возвращать true;
//b) Симметричность: если x.equals(y) возвращает true, то y.equals(x) тоже должен возвращать true;
//c) Консистентность: повторные вызовы x.equals(y) должны возвращать одинаковый результат, если объекты не изменились;

import java.util.Objects;

public class Computer {
    private int id;
    private String cpu;
    private int ram;
    private String videoCard;
    private int power;

    public Computer(int id, String cpu, int ram, String videoCard, int power) {
        this.id = id;
        this.cpu = cpu;
        this.ram = ram;
        this.videoCard = videoCard;
        this.power = power;
    }

    public int getId() {
        return id;
    }

    public int getPower() {
        return power;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public int getRam() {
        return ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram && power == computer.power && Objects.equals(cpu, computer.cpu) && Objects.equals(videoCard, computer.videoCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, videoCard, power);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", videoCard='" + videoCard + '\'' +
                ", power=" + power +
                '}';
    }
}
