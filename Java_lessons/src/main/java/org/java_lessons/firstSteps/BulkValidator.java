package org.java_lessons.firstSteps;

public class BulkValidator {
    public static void main(String[] args) {
        // Массив тестовых данных
        String[][] testData = {
                {"Qwerty123", "Qwerty123"}, // Валидный случай
                {"12345", "12345"},         // Слишком короткий
                {"StrongPass", "WrongPass"} // Не совпадают
        };

        System.out.println("ОТЧЁТ ВАЛИДАЦИИ:");

        // Цикл for: так проходим по всем элементам массива
        for (int i = 0; i < testData.length; i++) {
            String password = testData[i][0];
            String confirm = testData[i][1];

            System.out.println("\nТестовый случай №" + (i + 1) + ":");
            System.out.println("Пароль: " + password);
            System.out.println("Подтверждение: " + confirm);

            // Проверки
            if (password.length() >= 8) {
                System.out.println("Длина ОК");
            } else {
                System.out.println("Длина НЕ ОК");
            }

            if (password.equals(confirm)) {
                System.out.println("Совпадение ОК");
            } else {
                System.out.println("Совпадение НЕ ОК");
            }
        }
    }
}
