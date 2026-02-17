package org.java_lessons.lesson6;

public enum Season {
    WINTER("Зима"),
    SPRING("Весна"),
    SUMMER("Лето"),
    FALL("Осень");
    private final String rusName;

    Season(String rusName) {
        this.rusName = rusName;
    }

    public String getRusName() {
        return rusName;
    }
}

