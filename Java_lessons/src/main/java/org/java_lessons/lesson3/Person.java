package org.java_lessons.lesson3;

public class Person {
    // статическое поле принадлежит классу Person
    // final делает переменную className не изменяемой
    public static final String className = "Person";
    private String firstName;
    private String lastName;
    private int age;

    // конструктор без параметров
    public Person() {}

    // конструктор с параметрами firstName и lastName
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // конструктор с параметрами firstName и lastName и age
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Методы:
    // метод без параметров и без возвращаемого значения
    // видимость глобальная
    public void voice() {
        System.out.println("Привет");
    }

    // Getters и Setters
    // метод без параметров и возвращает строку имя
    // видимость глобальная
    public String getFirstName() {
        return firstName;
    }

    // метод с параметрами (получает строку на вход) и присваивает ее полю firstName
    // видимость глобальная
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Повторить для остальных полей по аналогии, кроме static
}
