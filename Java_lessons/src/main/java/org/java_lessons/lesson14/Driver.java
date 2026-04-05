package org.java_lessons.lesson14;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = "id")
@Getter
@Setter
@ToString

public class Driver {
    private UUID id;
    private String name;
    private Integer seniority;
    private Map<LocalDate, Car> dateCar;
    private Map<LocalDate, Double> summa;
    private double salary;
}
