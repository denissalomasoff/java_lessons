package org.java_lessons.lesson14;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Setter
@Getter
@EqualsAndHashCode(exclude = "id")
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Car {
    private UUID id;
    private String model;
    private Enum color;
    private Integer yearProduce;
    private String stateNumber;
    private Enum condition;
}
