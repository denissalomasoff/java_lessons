package ru.lessons.lesson9.step2;

import java.io.IOException;

public class FileReaderExecutor {
    public static void main(String[] args) {
        final var fileReader = new ru.lessons.lesson9.step2.FileReader();
        try {
            //верни текст из файла или выбрось exception
            final var result = fileReader.readFile("C:Users/denis/OneDrive/Рабочий стол/уроки/java_lessons/java_lessons/src/main/java/ru/lessons/lesson9/План.txt");
            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
