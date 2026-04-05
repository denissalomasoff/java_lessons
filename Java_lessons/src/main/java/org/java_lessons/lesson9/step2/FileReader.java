package ru.lessons.lesson9.step2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader {
    //метод чтения текстового файла, создает объект Path из строкового пути к файлу, читает и возвращает текст из файла с кодировкой UTF-8
    // в случае ошибки выбраcывает exception
    public String readFile(String path) throws IOException {
        return Files.readString(Path.of(path), StandardCharsets.UTF_8);
    }
}
