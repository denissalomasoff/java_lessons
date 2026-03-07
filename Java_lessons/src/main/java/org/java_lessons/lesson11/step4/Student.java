package ru.lessons.lesson11.step4;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(exclude = {"id"})
public class Student {
    private UUID id;
    private String name;
    private Integer age;
    private LocalDate dateOfBirth;
}
