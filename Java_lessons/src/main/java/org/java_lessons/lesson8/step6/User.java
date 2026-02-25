package ru.lessons.lesson8.step6;

import lombok.*;
//https://projectlombok.org/setup/maven
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class User {
    private String name;
    private String password;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;
}
