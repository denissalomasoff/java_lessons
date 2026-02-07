package ru.lessons.lesson3;

public abstract class Animal {
    private String name;
    private String sound;

    // Конструкторы
    public Animal() {
    }

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    // Абстрактные методы:
    public abstract void eat();
    public abstract void sleep();
}