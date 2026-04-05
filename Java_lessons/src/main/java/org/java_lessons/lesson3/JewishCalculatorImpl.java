
package ru.lessons.lesson3;


public class JewishCalculatorImpl implements ru.lessons.lesson3.Calculator {
    @Override
    public int add(int a, int b) {
        return (a + b) * 100;
    }

    @Override
    public int subtract(int a, int b) {
        return b - a;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b * 10000;
    }

    @Override
    public int divide(int a, int b) {
        return a / (b + 1);
    }

    @Override
    public void print() {
        System.out.println("Jewish calculator");
    }

    public void sayHello() {
        System.out.println("Hello World");
    }
}
