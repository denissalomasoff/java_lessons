package ru.lessons.lesson9.step4;

public class BankAccountRunner {
    public static void main(String[] args) {
        final var bankAccount = ru.lessons.lesson9.step4.BankAccount.builder()
                .active(true)
                .balance(-500)
                .firstname("Иван")
                .redSaldo(false)
                .build();

        final var validator = new ru.lessons.lesson9.step4.BankAccountValidator();
        try {
            final var valid = validator.validate(bankAccount);
            System.out.println("Результат проверки банковского счета = " + valid);
        } catch (ru.lessons.lesson9.step4.BankAccountException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(bankAccount.getLastname().toUpperCase()); // NPE
    }
}
