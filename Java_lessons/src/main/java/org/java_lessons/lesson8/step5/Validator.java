package ru.lessons.lesson8.step5;

public interface Validator {
    boolean validate(String str, boolean ignoreCase);
    void log(String message, ru.lessons.lesson8.step5.LogLevel logLevel);
}
