package org.java_lessons.lesson5.homework;

public class ComputerCatalog {
    public static void main(String[] args) {
        final Computer Computer1 = new Computer(123, "Dual-Core", 8, "NVidea RX7", 1200);
        final Computer Computer2 = new Computer(3214, "Dual-Core", 8, "NVidea RX7", 1200);
        final Computer Computer3 = new Computer(456456, "Quad-core", 12, "Yamaha R1", 1800);
        final Computer Computer4 = new Computer(276, "Quad-core", 12, "Yamaha R1", 1800);
        final Computer Computer5 = new Computer(163, "Octa-core", 24, "Radeon 300BestUltra", 2150);

        //Рефлексивность: x.equals(x) должен возвращать true
        System.out.println("Рефлексивность " + Computer1.equals(Computer1)); //возвращает true
        //Симметричность: если Computer1.equals(Computer2) возвращает true, то Computer2.equals(Computer1) тоже должен возвращать true;
        System.out.print("Симметричность " + Computer1.equals(Computer2) + " ");
        System.out.println(Computer2.equals(Computer1)); //true true
        //Консистентность: повторные вызовы Computer1.equals(Computer3) должны возвращать одинаковый результат, если объекты не изменились
        System.out.println("Консистентность " + Computer1.equals(Computer2));
        //Cравнение hashCode на long
        System.out.println("Хэш 1 " + (Computer1.hashCode()));
        System.out.println("Хэш 2 " + (Computer2.hashCode()));
        System.out.println("Сравнение hashCode " + (Computer1.hashCode() == Computer2.hashCode()));

    }
}
