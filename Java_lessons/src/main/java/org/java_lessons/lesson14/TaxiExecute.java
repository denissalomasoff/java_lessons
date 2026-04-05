package org.java_lessons.lesson14;


import java.time.LocalDate;
import java.util.*;

public class TaxiExecute {
    public static void main(String[] args) {

        final Car car1 = new Car(UUID.randomUUID(), "Mercedes E200", CarColor.WHITE, 2025, "У655СК123", CarCondition.NEW);
        final Car car2 = new Car(UUID.randomUUID(), "Toyota Camry", CarColor.GRAY, 2024, "М688НЕ123", CarCondition.MEDIUM);
        final Car car3 = new Car(UUID.randomUUID(), "Toyota Corolla", CarColor.YELLOW, 2022, "А086ХН123", CarCondition.MEDIUM);
        final Car car4 = new Car(UUID.randomUUID(), "Chevrolet Epica", CarColor.RED, 2018, "К723НЕ123", CarCondition.UNSATISFACTORY);
        final Car car5 = new Car(UUID.randomUUID(), "BMW 520", CarColor.BLUE, 2025, "К232МС23", CarCondition.NEW);

        Map<LocalDate, Car> dateCar1 = new HashMap<>();
        Map<LocalDate, Double> summa1 = new HashMap<>();
        dateCar1.put(LocalDate.of(2026, 4, 5), car1);
        summa1.put(LocalDate.of(2026, 4, 5), 12660.00);

        Map<LocalDate, Car> dateCar2 = new HashMap<>();
        Map<LocalDate, Double> summa2 = new HashMap<>();
        dateCar2.put(LocalDate.of(2026, 4, 3), car2);
        summa2.put(LocalDate.of(2026, 4, 3), 10340.00);

        Map<LocalDate, Car> dateCar3 = new HashMap<>();
        Map<LocalDate, Double> summa3 = new HashMap<>();
        dateCar3.put(LocalDate.of(2026, 4, 2), car3);
        summa3.put(LocalDate.of(2026, 4, 2), 9110.00);

        Map<LocalDate, Car> dateCar4 = new HashMap<>();
        Map<LocalDate, Double> summa4 = new HashMap<>();
        dateCar4.put(LocalDate.of(2026, 4, 1), car4);
        summa4.put(LocalDate.of(2026, 4, 1), 6900.00);

        Map<LocalDate, Car> dateCar5 = new HashMap<>();
        Map<LocalDate, Double> summa5 = new HashMap<>();
        dateCar5.put(LocalDate.of(2026, 4, 5), car5);
        summa5.put(LocalDate.of(2026, 4, 5), 12800.00);


        final Driver driver1 = new Driver(UUID.randomUUID(), "Зубенко М.О.", 1, dateCar1, summa1, 5500.00);
        final Driver driver2 = new Driver(UUID.randomUUID(), "Асхаб Ясин", 2, dateCar2, summa2, 5000.00);
        final Driver driver3 = new Driver(UUID.randomUUID(), "Нуруллоев Н.А.", 3, dateCar3, summa3, 4200.00);
        final Driver driver4 = new Driver(UUID.randomUUID(), "Яковлев А.И.", 2, dateCar4, summa4, 2800.00);
        final Driver driver5 = new Driver(UUID.randomUUID(), "Ляшкевич Ю.Я.", 1, dateCar5, summa5, 5900.00);

        List<Driver> drivers = new ArrayList<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        drivers.add(driver4);
        drivers.add(driver5);

        System.out.println("2.3 Сумма заработка каждого водителя: ");
        for (Driver driver : drivers) {
            System.out.println(driver.getName() + " - " + driver.getSumma().values() + " рублей за смену");
        }

        double maxSum = 0;
        for (Driver driver : drivers) {
            // Суммируем все значения в Map
            double totalSum = driver.getSumma().values().stream()
                    .mapToDouble(Double::doubleValue)
                    .sum();
            if (totalSum > maxSum) {
                maxSum = totalSum;
            }
        }

        double minSum = maxSum;
        for (Driver driver : drivers) {
            // Суммируем все значения в Map
            double totalSum1 = driver.getSumma().values().stream()
                    .mapToDouble(Double::doubleValue)
                    .sum();
            if (totalSum1 < minSum) {
                minSum = totalSum1;
            }
        }

        System.out.println("2.4 Максимальная  сумма: " + maxSum);
        System.out.println("Минимальная  сумма: " + minSum);

        System.out.println("2.5 Заработные платы водителей:");
        for (Driver driver : drivers) {
            double totalEarnings = driver.getSumma().values().stream()
                    .mapToDouble(Double::doubleValue)
                    .sum();
            double salary = totalEarnings * 0.1;
            driver.setSalary(salary);
            System.out.println(driver.getName() + " - " + driver.getSalary());
        }


    }
}
