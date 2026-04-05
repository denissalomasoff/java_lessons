package ru.lessons.lesson6.step3;

import ru.lessons.lesson6.step1.Status;

import java.util.Arrays;
import java.util.Scanner;

import static ru.lessons.lesson6.step1.Status.ERROR;
import static ru.lessons.lesson6.step1.Status.SUCCESS;
import static ru.lessons.lesson6.step3.Operation.*;

public class MainSwitchCase {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        System.out.println("Введите операцию по примеру = " + Arrays.toString(values()));
        final String inputOperation = sc.nextLine().trim().toUpperCase(); // например: ADD
        System.out.println("Введите первое число");
        final double number1 = sc.nextDouble();
        System.out.println("Введите второе число");
        final double number2 = sc.nextDouble();
        final var operation = ru.lessons.lesson6.step3.Operation.from(inputOperation);

        switch (operation) {
            case ADD -> print(ADD, (number1 + number2), SUCCESS);
            case SUB -> print(SUB, (number1 - number2), SUCCESS);
            case MUL -> print(MUL, (number1 * number2), SUCCESS);
            case DIV -> {
                if (number2 == 0) {
                    print(DIV, "Ошибка: деление на ноль", ERROR);
                } else {
                    print(DIV, (number1 / number2), SUCCESS);
                }
            }
            default -> System.out.println("Ошибка: неизвестная операция: " + operation.getValue());
        }
    }

    // Overloading
    private static void print(ru.lessons.lesson6.step3.Operation operation, double result, Status status) {
        System.out.printf("%s %f - статус = [%s]", operation.getValue(), result, status);
    }

    // Overloading
    private static void print(ru.lessons.lesson6.step3.Operation operation, String errorMessage, Status status) {
        System.out.printf("%s статус = [%s] %s", operation.getValue(), errorMessage, status);
    }
}
