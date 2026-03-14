package ru.lessons.lesson12.step3;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class CalendarRunner {
    public static void main(String[] args) {
        Map<LocalDate, String> map = new HashMap<>();
        map.put(LocalDate.now(), "Раб");
        map.put(LocalDate.now().plusDays(1), "Вых");
        map.put(LocalDate.now().minusDays(3), "Раб");


        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("1", "One");
        dictionary.put("Кот", "Cat");
        dictionary.put("Жопа", "Ass");

        for (Map.Entry<LocalDate, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        map.entrySet().forEach(entry -> System.out.println(entry));

        System.out.println(dictionary.get("Кот"));
        System.out.println(dictionary.values());
        System.out.println(dictionary.getOrDefault("Собака", "Dog"));
        System.out.println(map.get(LocalDate.now()));
    }
}
