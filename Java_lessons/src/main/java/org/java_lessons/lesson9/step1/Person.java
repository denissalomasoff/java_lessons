package ru.lessons.lesson9.step1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Person {
    private String firstname;
    private String lastname;
    private int age;
    private String email;


    public void setFirstname(String firstname) {
        if (firstname == null || firstname.isEmpty()) {
            throw new IllegalArgumentException("Имя пустое");
        }
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        if (lastname == null || lastname.isEmpty()) {
            throw new IllegalArgumentException("Фамилия пустая");
        }
        this.lastname = lastname;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Неверный возраст");
        }
        this.age = age;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email невалидный формат");
        }
        this.email = email;
    }
}
