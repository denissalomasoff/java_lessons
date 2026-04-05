package ru.lessons.lesson3;

// обычный
// маркер
// функциональные имеют только один абстрактный метод
public interface Calculator {
    // поле интерфейса
    // по умолчанию public static final
    String message = "Hello World";
    // абстрактные методы, без реализации
    // по умолчанию public
    int add(int a, int b);
    int subtract(int a, int b);
    int multiply(int a, int b);
    int divide(int a, int b);

    // c реализацией
    default void print() {
        System.out.println(message);
    }
}