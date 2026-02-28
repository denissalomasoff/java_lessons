package ru.lessons.lesson9.step1;

public class PersonBuilder {
    public static void main(String[] args) {
        try {
            //переменной var присваиваем значение нового экземпляра класса Person;
            final var person = new ru.lessons.lesson9.step1.Person();
            // устанавливаем значение без @;
            person.setEmail("email");
            // Если все ок, печатай экземпляр класса Person
            System.out.println(person);
            //Если есть ошибки в установке значений, выбрасывай exception c текстом
        } catch (IllegalArgumentException ex) {
            // обращение к переменной ex класса IllegalArgEcx, вызываем метод встроенный getMessage
            //message – the detail message (which is saved for later retrieval by the Throwable.getMessage() method).
            System.out.println(ex.getMessage());
        }
    }
}
