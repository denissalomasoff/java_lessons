package ru.lessons.lesson8.step6;

public class Main {
    public static void main(String[] args) {
        final var user = ru.lessons.lesson8.step6.User.builder()
                .phone("123456789")
                .name("John")
                .build();

        System.out.println(user);

    }
}
