package ru.lessons.lesson9.step1;

public class PersonBuilder {
    public static void main(String[] args) {
        try {
            final var person = new ru.lessons.lesson9.step1.Person();
            person.setEmail("email");
            System.out.println(person);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
