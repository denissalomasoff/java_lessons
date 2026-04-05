package org.java_lessons.lesson2;

public class House {
    public static void main(String[] args) {
        Home h = new Home();
        h.address = "1_Avenue";
        h.height = 4;
        h.width = 5;
        h.cost = 10000;

        Home h2 = new Home();
        h2.address = "2_Street";
        h2.height = 6;
        h2.width = 4;
        h2.cost = 12000;

        Home h3 = new Home();
        h3.address = "3_Boulevard";
        h3.height = 10;
        h3.width = 8;
        h3.cost = 21000;

        Home h4 = new Home();

        Home h5 = new Home(12500);

        Home h6 = new Home("Partizanskaya", 12, 12, 50000);

        System.out.println(h2.address);
        System.out.println(h2.width);
        System.out.println(h2.cost);

    }
}
