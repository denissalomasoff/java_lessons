package org.java_lessons.firstSteps;

public class PasswordValidator {
    public static void main(String[] args) {
        String password ="Qwerty123";
        String confirmPassword = "Qwerty123";

        boolean isLengthValid;
        boolean isPasswordMatch;

        // Условная конструкция: проверяем длину
        if (password.length() >= 8) {
            isLengthValid = true;
            System.out.println("Длина пароля корректна");
        } else {
            isLengthValid = false;
            System.out.println("Ошибка: пароль должен быть не менее 8 символов");
        }

        // Проверяем совпадение паролей
        if (password.equals(confirmPassword)) {
            isPasswordMatch = true;
            System.out.println("Пароли совпадают");
        } else {
            isPasswordMatch = false;
            System.out.println("Ошибка: пароли не совпадают");
        }

        // Итоговый вердикт
        if (isLengthValid && isPasswordMatch) {
            System.out.println("Регистрация возможна: все проверки пройдены");
        } else {
            System.out.println("Регистрация отклонена: исправьте ошибки");
        }

    }
}
