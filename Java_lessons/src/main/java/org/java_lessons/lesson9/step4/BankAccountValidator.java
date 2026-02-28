package ru.lessons.lesson9.step4;

public class BankAccountValidator {
    public boolean validate(ru.lessons.lesson9.step4.BankAccount bankAccount) {
        if (!bankAccount.isActive()) {
            throw new ru.lessons.lesson9.step4.BankAccountException("Банковский счет не активный");
        }
        if (bankAccount.getBalance() < 0 && !bankAccount.isRedSaldo()) {
            throw new ru.lessons.lesson9.step4.BankAccountException("Остаток на банковском счете не может быть отрицательным");
        }
        return true;
    }
}
