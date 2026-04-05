package ru.lessons.lesson6.step1;

public class MainRunner {
    public static void main(String[] args) {
        ru.lessons.lesson6.step1.Status status = ru.lessons.lesson6.step1.Status.SUCCESS;
        System.out.println(status);

        ru.lessons.lesson6.step1.Gender gender = ru.lessons.lesson6.step1.Gender.FEMALE;
        System.out.println(gender);
        System.out.println(gender.getValue());

        ru.lessons.lesson6.step1.Seasons seasons = ru.lessons.lesson6.step1.Seasons.SPRING;
        System.out.println(String.format("%s начиная с месяца %d - %d",
                seasons.getRusName(),
                seasons.getStartMonthNumber(),
                seasons.getEndMonthNumber()));
    }
}
