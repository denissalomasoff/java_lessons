package ru.lessons.lesson9.step4;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BankAccount {
    private String firstname;
    private String lastname;
    private double balance;
    private boolean active;
    private boolean redSaldo;
}
