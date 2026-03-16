package org.java_lessons.firstSteps;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class PasswordValidatorTest {
    @Test
    void shouldPassWhenPasswordIsValidAndMatches() {
        // Данные (Given)
        String password = "StrongPass123";
        String confirm = "StrongPass123";

        // Действие (When)
        boolean isLengthValid = password.length() >= 8;
        boolean isPasswordMatch = password.equals(confirm);

        // Проверка (Then)
        Assertions.assertTrue(isLengthValid, "Длина пароля менее 8 символов");
        Assertions.assertTrue(isPasswordMatch, "Пароли не совпадают");
    }

    @Test
    void shouldFailWhenPasswordTooShort() {
        String password = "123";
        String confirm = "123";

        boolean isLengthValid = password.length() >= 8;
        boolean isPasswordMatch = password.equals(confirm);

        Assertions.assertFalse(isLengthValid, "Пароль должен быть забракован из-за длины");
        Assertions.assertTrue(isPasswordMatch);
    }
}
