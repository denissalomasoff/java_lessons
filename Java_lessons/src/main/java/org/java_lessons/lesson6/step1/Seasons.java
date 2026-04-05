package ru.lessons.lesson6.step1;

public enum Seasons {
    SPRING("Весна", 3, 5),
    SUMMER("Лето", 6, 8),
    AUTUMN("Осень", 9, 11),
    WINTER("Зима", 12, 2);

    private final String rusName;
    private final int startMonthNumber;
    private final int endMonthNumber;

    Seasons(String rusName, int startMonthNumber, int endMonthNumber) {
        this.rusName = rusName;
        this.startMonthNumber = startMonthNumber;
        this.endMonthNumber = endMonthNumber;
    }

    public String getRusName() {
        return rusName;
    }

    public int getStartMonthNumber() {
        return startMonthNumber;
    }

    public int getEndMonthNumber() {
        return endMonthNumber;
    }
}
