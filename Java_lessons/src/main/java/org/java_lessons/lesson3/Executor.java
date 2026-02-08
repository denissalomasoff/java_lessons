package ru.lessons.lesson3;

import org.java_lessons.lesson3.ProductCredit;

import java.time.LocalDate;
import java.util.UUID;

public class Executor {
    public static void main(String[] args) {
        //  Get from DB
        final ProductCredit productCredit = new ProductCredit();
        productCredit.setActive(true);
        productCredit.setNumber("Num123");
        productCredit.setArrangement("arr");
        productCredit.setId(UUID.randomUUID());
        System.out.println(productCredit.getId());
        //  PUT to DB
        productCredit.setActive(false);

        final ru.lessons.lesson3.Request request = new ru.lessons.lesson3.Request(UUID.randomUUID(), LocalDate.now());

        if (request.getProductId() == null) {
            System.out.println("Ошибка");
        }

        request.setProductId(UUID.randomUUID());
    }
}