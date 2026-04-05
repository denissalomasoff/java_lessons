package ru.lessons.lesson3;

// Наследование (расширение) абстрактного (родительского, super) класса
public class Dog extends ru.lessons.lesson3.Animal {
    // Обязательное переопределение абстрактных методов
    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    // Обязательное переопределение абстрактных методов
    @Override
    public void sleep() {
        System.out.println("Dog sleep");
    }
}