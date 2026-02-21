package ru.lessons.lesson6.step1;

public enum Gender {
    MALE("male"), FEMALE("female");

    private final String value;
    // Конструктор
    Gender(String value) {
        this.value = value;
    }

    // Getter
    public String getValue() {
        return value;
    }
}

