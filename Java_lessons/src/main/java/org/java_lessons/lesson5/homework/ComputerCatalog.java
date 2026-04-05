package org.java_lessons.lesson5.homework;

public class ComputerCatalog {
    public static void main(String[] args) {
        final Computer сomputer1 = new Computer(123, "Dual-Core", 8, "NVidea RX7", 1200);
        final Computer сomputer2 = new Computer(3214, "Dual-Core", 8, "NVidea RX7", 1200);
        final Computer сomputer3 = new Computer(456456, "Quad-core", 12, "Yamaha R1", 1800);
        final Computer сomputer4 = new Computer(276, "Quad-core", 12, "Yamaha R1", 1800);
        final Computer сomputer5 = new Computer(163, "Octa-core", 24, "Radeon 300BestUltra", 2150);

        //Рефлексивность: x.equals(x) должен возвращать true
        System.out.println("Рефлексивность " + сomputer1.equals(сomputer1)); //возвращает true
        //Симметричность: если сomputer1.equals(сomputer2) возвращает true, то сomputer2.equals(сomputer1) тоже должен возвращать true;
        System.out.print("Симметричность " + сomputer1.equals(сomputer2) + " ");
        System.out.println(сomputer2.equals(сomputer1)); //true true
        //Консистентность: повторные вызовы сomputer1.equals(сomputer3) должны возвращать одинаковый результат, если объекты не изменились
        System.out.println("Консистентность " + сomputer1.equals(сomputer2));
        //Cравнение hashCode на long
        System.out.println("Хэш 1 " + (сomputer1.hashCode()));
        System.out.println("Хэш 2 " + (сomputer2.hashCode()));
        System.out.println("Сравнение hashCode " + (сomputer1.hashCode() == сomputer2.hashCode()));

    }
}
