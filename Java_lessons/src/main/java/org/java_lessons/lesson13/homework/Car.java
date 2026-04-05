package org.java_lessons.lesson13.homework;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
@Setter

public class Car{
    private String brand;
    private String model;
    private double price;
    private String color;
    private Integer yearRelease;
    private Integer owners;
    }


