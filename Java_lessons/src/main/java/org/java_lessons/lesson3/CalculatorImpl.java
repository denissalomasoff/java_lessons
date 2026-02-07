
package ru.lessons.lesson3;

// реализация методов контракта интерфейса
public class CalculatorImpl implements Calculator {
    // @Override переопределение методов интерфейса
    // обязательное
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        return b == 0 ? 0 : a / b;
    }
}
