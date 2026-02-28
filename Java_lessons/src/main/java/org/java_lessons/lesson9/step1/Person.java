package ru.lessons.lesson9.step1;

import lombok.*;

// Конструктор со всеми параметрами
@AllArgsConstructor
// Конструктор без параметров
@NoArgsConstructor
// Геттеры
@Getter
@ToString
// параметры экземпляров класса Person
public class Person {
    private String firstname;
    private String lastname;
    private int age;
    private String email;

    //Установка параметра FirstName. Если значение пустое, выбрасывать exception с текстом.
    // если все ок, то установить значение
    public void setFirstname(String firstname) {
        if (firstname == null || firstname.isEmpty()) {
            throw new IllegalArgumentException("Имя пустое");
        }
        this.firstname = firstname;
    }
    //Установка параметра LastName. Если значение пустое, выбрасывать exception с текстом
    public void setLastname(String lastname) {
        if (lastname == null || lastname.isEmpty()) {
            throw new IllegalArgumentException("Фамилия пустая");
        }
        this.lastname = lastname;
    }
    //Установка параметра age. Если значение меньше 0 или больше 100, выбрасывать exception с текстом
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Неверный возраст");
        }
        this.age = age;
    }
    //Установка параметра email. Если значение пустое, или в значении нет символа "@", выбрасывать exception с текстом
    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email невалидный формат");
        }
        this.email = email;
    }
}
