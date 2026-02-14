package org.java_lessons.lesson5.homework;

public class ComputerCatalog {
    public static void main(String[] args) {
        Computer x = new Computer(1, "Dual-Core", 8, "NVidea RX7", 1200);
        Computer x1 = new Computer(1, "Dual-Core", 8, "NVidea RX7", 1200);
        Computer y = new Computer(2, "Quad-core", 12, "Yamaha R1", 1800);
        Computer y1 = new Computer(2, "Quad-core", 12, "Yamaha R1", 1800);
        Computer z = new Computer(3, "Octa-core", 24, "Radeon 300BestUltra", 2150);
        Computer z1 = new Computer(3, "Octa-core1", 24, "Radeon 300BestUltra1", 2150);

        //Рефлексивность: x.equals(x) должен возвращать true
        System.out.println("Рефлексивность " + x.equals(x)); //возвращает true
        //Симметричность: если x.equals(y) возвращает true, то y.equals(x) тоже должен возвращать true;
        System.out.print("Симметричность " + x.equals(x1) + " ");
        System.out.println(x1.equals(x)); //true true
        //Консистентность: повторные вызовы x.equals(y) должны возвращать одинаковый результат, если объекты не изменились
        System.out.println("Консистентность " + x.equals(x1));
        //Cравнение hashCode на long
        System.out.println("Хэш 1 " + (x.hashCode()));
        System.out.println("Хэш 2 " + (x1.hashCode()));
        System.out.println("Сравнение hashCode " + (x.hashCode() == x1.hashCode()));

    }
}
