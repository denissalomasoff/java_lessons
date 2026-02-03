package org.java_lessons.lesson3;

public class User {
    // поле константа, при условии его инициализации в конструкторе
    private final  String firstName;
    // поле константа, при условии его инициализации в конструкторе
    private final String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // Нет возможности создать конструктор без параметров
    //    public User() {
    //    }

    // Есть только возможность генерировать Getters
    // по скольку поля присвоят значения при создании объетка через контруктор
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
