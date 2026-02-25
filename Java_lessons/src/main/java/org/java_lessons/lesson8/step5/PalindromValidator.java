package ru.lessons.lesson8.step5;

import java.time.LocalDateTime;

public class PalindromValidator implements ru.lessons.lesson8.step5.Validator {

    @Override
    public boolean validate(String str, boolean ignoreCase) {
        // Если пустая строка => false
        if (str == null || str.isEmpty()) {
            // вывод лога - ERROR
            log("Пустая строка", ru.lessons.lesson8.step5.LogLevel.ERROR);
            return false;
        }
        // если 1 символ, всегда палиндром, но уровень WARNING
        if (str.length() == 1) {
            log(str, ru.lessons.lesson8.step5.LogLevel.WARNING);
            return true;
        }
        // Если передан флаг игнорировать прописные или заглавные
        if (ignoreCase) {
            // приводим на прописные
            str = str.toLowerCase();
        }

        for (int i = 0; i < str.length() / 2; i++) {
            // берем 1й и последний символ и проверяем
            // и так далее
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                log("Не палиндром", ru.lessons.lesson8.step5.LogLevel.ERROR);
                return false;
            }
        }
        log("Палиндром - Ok!!!", ru.lessons.lesson8.step5.LogLevel.INFO);
        return true;
    }

    @Override
    public void log(String message, ru.lessons.lesson8.step5.LogLevel logLevel) {
        System.out.printf("[%s] - [%s] - %s%n", LocalDateTime.now().toString().substring(0, 19), logLevel, message);
    }
}
