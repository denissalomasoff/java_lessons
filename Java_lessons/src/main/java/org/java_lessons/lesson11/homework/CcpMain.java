package org.java_lessons.lesson11.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.ThreadLocalRandom;

public class CcpMain {
    public static void main(String[] args) {

        final CorporateProductCredit credit1 = new CorporateProductCredit(UUID.randomUUID(), 3L, 2L, true, generateRandomDate());
        final CorporateProductCredit credit2 = new CorporateProductCredit(UUID.randomUUID(), 2L, 4L, false, generateRandomDate());
        final CorporateProductCredit credit3 = new CorporateProductCredit(UUID.randomUUID(), 1L, 5L, true, generateRandomDate());
        final CorporateProductCredit credit4 = new CorporateProductCredit(UUID.randomUUID(), 3L, 2L, false, generateRandomDate());
        final CorporateProductCredit credit5 = new CorporateProductCredit(UUID.randomUUID(), 4L, 1L, true, generateRandomDate());
        final CorporateProductCredit credit6 = new CorporateProductCredit(UUID.randomUUID(), 3L, 2L, true, generateRandomDate());
        final CorporateProductCredit credit7 = new CorporateProductCredit(UUID.randomUUID(), 1L, 3L, false, generateRandomDate());
        final CorporateProductCredit credit8 = new CorporateProductCredit(UUID.randomUUID(), 1L, 4L, true, generateRandomDate());
        final CorporateProductCredit credit9 = new CorporateProductCredit(UUID.randomUUID(), 3L, 5L, false, LocalDate.of(2004, 3, 1));
        final CorporateProductCredit credit10 = new CorporateProductCredit(UUID.randomUUID(), 3L, 5L, false, LocalDate.of(2004, 3, 1));
        // Создается множество credits, состоящее из 10 кредитов, хэшсет автоматически удаляет дубликаты, кроме id;
        final var credits = new HashSet<>(List.of(credit1, credit2, credit3, credit4, credit5, credit6, credit7, credit8, credit9, credit10));
        //Создаем список из множества без дубликатов. Необходим для последующей сортировки;
        List<CorporateProductCredit> sortCredits = new ArrayList<>(credits);
        //Создание нового объекта компаратора;
        CorporateProductCreditComparator comparator = new CorporateProductCreditComparator();
        // Сортировка списка с использованием переданного компаратора;
        sortCredits.sort(comparator);
        //System.out.println(sortUniqueCredits);
        System.out.println("Отсортированный по expirationTime список без дубликатов:");
        for (int i = 0; i < sortCredits.size(); i++) {
            CorporateProductCredit credit = sortCredits.get(i);
            System.out.println(credit.getExpirationTime() + " " + credit.getId() + " " + credit.getTypeId() + " " + credit.getStatusId() + " " + credit.isActive());
        }
    }

    private static LocalDate generateRandomDate() {
        LocalDate startDate = LocalDate.of(2000, 1, 1);
        LocalDate endDate = LocalDate.now();

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        long randomDays = ThreadLocalRandom.current().nextLong(daysBetween + 1);

        return startDate.plusDays(randomDays);
    }
}
