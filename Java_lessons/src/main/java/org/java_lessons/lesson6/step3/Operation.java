package ru.lessons.lesson6.step3;

public enum Operation {
    ADD("Сумма"),
    SUB("Разница"),
    MUL("Умножение"),
    DIV("Деление"),
    DEFAULT("Не найдена операция");

    private final String value;
    Operation(String value) {
        this.value = value;
    }

    String getValue() {
        return value;
    }

    public static Operation from(String operation) {
        try {
            return Operation.valueOf(operation.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            return Operation.DEFAULT;
        }
    }
}
