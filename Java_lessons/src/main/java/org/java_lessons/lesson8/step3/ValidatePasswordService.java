package ru.lessons.lesson8.step3;

public class ValidatePasswordService {
    public static void main(String[] args) {
        System.out.println("Валидация пароля = " + validate("24fdhghgh")); // false
        System.out.println("Валидация пароля = " + validate("24f/*dhghgh")); // true
        System.out.println("Валидация пароля = " + validate("241213ghgh"));  // false
    }

    private static boolean validate(String password) {
        if (password == null || password.length() < 8) {
            System.out.println("Пароль пустой или количество символов < 8");
            return false;
        }
        final String specialSymbols = "+-*/~%$#";
        int countLetter = 0;
        int countNumbers = 0;
        int countSpecialSymbols = 0;
        for (char chr : password.toCharArray()) {
            if (Character.isSpaceChar(chr) || Character.isWhitespace(chr)) {
                return false;
            } else if (Character.isAlphabetic(chr)) {
                countLetter++;
            } else if (Character.isDigit(chr)) {
                countNumbers++;
            } else if (specialSymbols.contains(String.valueOf(chr))) {
                countSpecialSymbols++;
            }
        }
        return (countNumbers != 0) && (countLetter != 0) && (countSpecialSymbols != 0);
    }
}

