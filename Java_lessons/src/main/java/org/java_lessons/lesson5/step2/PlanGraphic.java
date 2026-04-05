package org.java_lessons.lesson5.step2;

import java.time.LocalDate;
import java.util.UUID;

public class PlanGraphic {
    // id планового графика
    private UUID id;
    // id ЭП
    private UUID productCreditId;
    // дата начала
    private LocalDate startDate;
    // дата окончания
    private LocalDate endDate;
    // признак активности графика гашений
    private boolean isActive;

    public static final String RusClassName = "Плановый график";

    // Приватный конструктор, нет доступа извне
    // Других конструкторов нет
    private PlanGraphic() {

    }

    // static метод принадлежит классу PlanGraphic
    public static PlanGraphic of(UUID id,
                                 UUID productCreditId,
                                 LocalDate startDate,
                                 LocalDate endDate,
                                 boolean isActive) {
        PlanGraphic planGraphic = new PlanGraphic();
        planGraphic.id = id;
        planGraphic.productCreditId = productCreditId;
        planGraphic.startDate = startDate;
        planGraphic.endDate = endDate;
        planGraphic.isActive = isActive;
        return planGraphic;
    }

    // Только Getters, нет даем возможности менять через Setters
    public UUID getId() {
        return id;
    }

    public UUID getProductCreditId() {
        return productCreditId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public boolean isActive() {
        return isActive;
    }
}
