package org.java_lessons.lesson11.homework;

import java.time.LocalDate;
import java.util.UUID;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.ThreadLocalRandom;

public class CcpMain {
    public static void main(String[] args) {

        final CorporateProductCredit credit1 = new CorporateProductCredit(UUID.randomUUID(), 3L, 2L, true, generateRandomDate(), generateRandomDate());
        final CorporateProductCredit credit2 = new CorporateProductCredit(UUID.randomUUID(), 2L, 4L, false, generateRandomDate(), generateRandomDate());
        final CorporateProductCredit credit3 = new CorporateProductCredit(UUID.randomUUID(), 1L, 5L, true, generateRandomDate(), generateRandomDate());
        final CorporateProductCredit credit4 = new CorporateProductCredit(UUID.randomUUID(), 3L, 2L, false, generateRandomDate(), generateRandomDate());
        final CorporateProductCredit credit5 = new CorporateProductCredit(UUID.randomUUID(), 4L, 1L, true, generateRandomDate(), generateRandomDate());
        final CorporateProductCredit credit6 = new CorporateProductCredit(UUID.randomUUID(), 3L, 2L, true, generateRandomDate(), generateRandomDate());
        final CorporateProductCredit credit7 = new CorporateProductCredit(UUID.randomUUID(), 1L, 3L, false, generateRandomDate(), generateRandomDate());
        final CorporateProductCredit credit8 = new CorporateProductCredit(UUID.randomUUID(), 1L, 4L, true, generateRandomDate(), generateRandomDate());
        final CorporateProductCredit credit9 = new CorporateProductCredit(UUID.randomUUID(), 3L, 5L, false, generateRandomDate(), generateRandomDate());
        final CorporateProductCredit credit10 = new CorporateProductCredit(UUID.randomUUID(), 3L, 2L, true, generateRandomDate(), generateRandomDate());
        System.out.println(credit8);
        System.out.println(credit9);
    }
    private static LocalDate generateRandomDate() {
        LocalDate startDate = LocalDate.of(2000, 1, 1);
        LocalDate endDate = LocalDate.now();

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        long randomDays = ThreadLocalRandom.current().nextLong(daysBetween + 1);

        return startDate.plusDays(randomDays);
    }
}
