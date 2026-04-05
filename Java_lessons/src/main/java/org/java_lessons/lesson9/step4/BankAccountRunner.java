package ru.lessons.lesson9.step4;

public class BankAccountRunner {
    public static void main(String[] args) {
        // при помощи билдера создаем новый объект класса
        final var bankAccount = ru.lessons.lesson9.step4.BankAccount.builder()
                .active(true)
                .balance(-500)
                .firstname("Иван")
                .redSaldo(true)
                .build();

        final var validator = new ru.lessons.lesson9.step4.BankAccountValidator();
        try {
            //возвращаем в ответ на вызов метода validate результат или exception
            final var valid = validator.validate(bankAccount);
            System.out.println("Результат проверки банковского счета = " + valid);
        } catch (ru.lessons.lesson9.step4.BankAccountException ex) {
            System.out.println(ex.getMessage());
        }
        // для проверки NPE вызываем getLastName, значение которого равно NULL
        //System.out.println(bankAccount.getLastname().toUpperCase()); // NPE
    }
}
