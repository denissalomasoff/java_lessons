package ru.lessons.lesson6.step5;

import ru.lessons.lesson3.Calculator;

public class Main {
    public static void main(String[] args) {
        ru.lessons.lesson6.step5.Circle circle = new ru.lessons.lesson6.step5.Circle(5);
        ru.lessons.lesson6.step5.Square square = new ru.lessons.lesson6.step5.Square(5);

        System.out.println(ru.lessons.lesson6.step5.CalculateSquare.calc(circle));
        System.out.println(ru.lessons.lesson6.step5.CalculateSquare.calc(square));
    }
}
