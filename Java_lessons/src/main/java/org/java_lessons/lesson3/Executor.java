package ru.lessons.lesson3;

import java.time.LocalDate;
import java.util.UUID;

public class Executor {
    public static void main(String[] args) {
        // Get from DB
        final ProductCredit productCredit = new ProductCredit();
        productCredit.setActive(true);
        productCredit.setName("John");
        productCredit.setArrangement("arr");
        productCredit.setId(UUID.randomUUID());

        System.out.println(productCredit.getId());
        // PUT to DB
        productCredit.setActive(false);

        final Request request = new Request(UUID.randomUUID(), LocalDate.now());

        if (request.getProductId() == null) {
            System.out.println("Ошибка");
        }

        request.setProductId(UUID.randomUUID());
    }
}