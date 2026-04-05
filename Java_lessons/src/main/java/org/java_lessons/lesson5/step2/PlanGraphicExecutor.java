package org.java_lessons.lesson5.step2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class PlanGraphicExecutor {
    public static void main(String[] args) {
        org.java_lessons.lesson5.step2.PlanGraphic planGraphic = org.java_lessons.lesson5.step2.PlanGraphic.of(
                UUID.randomUUID(),
                UUID.randomUUID(),
                LocalDate.of(2026, 1, 11),
                LocalDate.of(2026, 4, 11),
                true);

        // выведем на сколько дней создан договор
        // разница между startDate и endDate
        System.out.println(ChronoUnit.DAYS.between(planGraphic.getStartDate(), planGraphic.getEndDate()) + " дней");
        System.out.println(PlanGraphic.RusClassName);
    }
}
