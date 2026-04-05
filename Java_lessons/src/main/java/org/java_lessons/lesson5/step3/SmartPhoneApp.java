package org.java_lessons.lesson5.step3;

public class SmartPhoneApp {
    public static void main(String[] args) {
        org.java_lessons.lesson5.step3.SmartPhone samsungS26Ultra = new org.java_lessons.lesson5.step3.SmartPhone(
               "Samsung S26 Ultra",
               "Samsung",
               85_000);

        System.out.println(samsungS26Ultra);


        org.java_lessons.lesson5.step3.SmartPhone samsungS26Ultra_1 = new org.java_lessons.lesson5.step3.SmartPhone(
                "Samsung S26 Ultra",
                "Samsung",
                85_000);
        // сравнение ссылок
        System.out.println(samsungS26Ultra_1 == samsungS26Ultra);

        System.out.println(samsungS26Ultra_1.equals(samsungS26Ultra));

        // 1. Правило: если hash коды объектов не равны, то и объекты не равны;
        // 2. Равенство hash кодов не гарантирует равенство объектов;
        // 3. Равенство по equals дает гарантию равенства объектов;

    }
}
