package ru.lessons.lesson9.step3;

public class CalculatorImpl implements ru.lessons.lesson9.step3.Calculator {
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    @Override
    public double mul(double a, double b) {
        return a * b;
    }

    @Override
    public double div(double a, double b) {
        try {
            return a / b;
        } catch (Exception ex) {
            throw new ArithmeticException(ex.getMessage());
        }
    }
}
