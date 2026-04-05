package org.java_lessons.lesson11.homework;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(exclude = "id")
public class CorporateProductCredit {
    private UUID id;
    private Long statusId;
    private Long typeId;
    private boolean active;
    private LocalDate expirationTime;
}
