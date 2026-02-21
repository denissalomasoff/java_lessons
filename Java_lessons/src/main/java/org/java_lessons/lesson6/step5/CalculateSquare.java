package ru.lessons.lesson6.step5;

public class CalculateSquare {

    public static double calc(Object shape) {

        if (shape instanceof ru.lessons.lesson6.step5.Circle circle) {
            return Math.PI * Math.pow(circle.getRadius(), 2);
        }

        if (shape instanceof ru.lessons.lesson6.step5.Square square) {
            return Math.pow(square.getSide(), 2);
        }
        return 0;
    }
}
