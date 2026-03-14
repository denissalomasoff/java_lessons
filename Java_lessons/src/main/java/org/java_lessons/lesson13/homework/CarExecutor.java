package org.java_lessons.lesson13.homework;

import java.util.ArrayList;
import java.util.List;


public class CarExecutor {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Mercedes", "C300", 5000.0, "Black", 2020, 2));
        carList.add(new Car("Mercedes", "GLK220", 4000.0, "White", 2014, 2));
        carList.add(new Car("Mercedes", "G500", 5500.0, "Gray", 2022, 1));
        carList.add(new Car("BMW", "525D", 3700.0, "Black", 2025, 1));
        carList.add(new Car("BMW", "135", 3450.0, "Blue", 2023, 4));
        carList.add(new Car("Skoda", "Octavia RS", 2100.0, "Blue", 2012, 4));
        carList.add(new Car("Lada", "Niva 4X4", 2500.0, "White", 2026, 1));
        carList.add(new Car("Toyota", "Camry", 4000.0, "Red", 2024, 2));
        carList.add(new Car("Toyota", "LC200", 5200.0, "Black", 2015, 2));
        carList.add(new Car("Volkswagen", "Tiguan", 5050.0, "Black", 2021, 1));

        //1.1. Отобрать список машин старше 2020 года выпуска;
        List<Car> oldCars = new ArrayList<>();
        for (Car car : carList) {
            if (car.getYearRelease() < 2020) {
                oldCars.add(car);
            }

        }
        System.out.println("1.1. Автомобили старше 2020 года:\n" + oldCars);

        //1.2 Автомобили дешевле 5000$ меняем цвет;
        List<Car> newColorCheapCars = new ArrayList<>();
        for (Car car : carList) {
            if (car.getPrice() < 5000.0) {
                newColorCheapCars.add(new Car(
                        car.getBrand(),
                        car.getModel(),
                        car.getPrice(),
                        "Yellow",
                        car.getYearRelease(),
                        car.getOwners()
                ));
            }
        }
        System.out.println("1.2. Автомобили дешевле 5000:\n" + newColorCheapCars);

        //1.3 Преобразовать цены в руб;
        List<Car> rusPriceCars = new ArrayList<>();
        for (Car car : carList) {
            rusPriceCars.add(new Car(
                    car.getBrand(),
                    car.getModel(),
                    car.getPrice() * 79,
                    car.getColor(),
                    car.getYearRelease(),
                    car.getOwners()
            ));
        }
        System.out.println("1.3. Автомобили с ценами в рублях:\n" + rusPriceCars);

        //1.4 Повысить цены на авто старше 2020 на 10000 руб;
        List<Car> changePriceOldCars = new ArrayList<>();
        for (Car car : rusPriceCars) {
            if (car.getYearRelease() < 2020) {
                changePriceOldCars.add(new Car(
                        car.getBrand(),
                        car.getModel(),
                        car.getPrice() + 10000.0,
                        car.getColor(),
                        car.getYearRelease(),
                        car.getOwners()
                ));
            }
        }
        System.out.println("1.4. Авто старше 2020 года с увеличением цены :\n" + changePriceOldCars);

        // Перебрать список, найти первое авто с ценой < 150000 руб, если нет выбросить CarNotFoundException(“Авто с ценой < 150000 не обнаружено”);
        try {
            //Преобразуем список в стрим, который позволяет обрабатывать элементы списка по одному;
            Car cheapCar = rusPriceCars.stream()
                    //c - это каждый автомобиль из списка (сокращение от car);
                    //-> - лямбда-выражение Пропускает дальше только те автомобили, которые удовлетворяют условию, стальные отсеиваются;
                    .filter(c -> c.getPrice() < 150000.0)
                    //Берет первый элемент из отфильтрованного стрима;
                    .findFirst()
                    .orElseThrow(() -> new CarNotFoundException("Авто с ценой < 150000 не обнаружено."));

            System.out.println("Авто дешевле 150000 руб:\n" + cheapCar);

        } catch (CarNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

       //Через any-all-non-match проверить условие цена > 2000000 и 1 владелец и год выпуска > 2016;
        boolean hasExpensiveCar = rusPriceCars.stream()
                .anyMatch(car -> car.getPrice() > 2000000
                        && car.getOwners() == 1
                        && car.getYearRelease() > 2016);

        if (hasExpensiveCar) {
            System.out.println("Найден хотя бы один автомобиль с ценой > 2 млн руб, 1 владельцем и годом выпуска > 2016");
        } else {
            System.out.println("Нет ни одного автомобиля, удовлетворяющего условию: цена > 2 млн руб, 1 владелец, год выпуска > 2016");
        }

        boolean allCarsExpensive = rusPriceCars.stream()
                .allMatch(car -> car.getPrice() > 2000000
                        && car.getOwners() == 1
                        && car.getYearRelease() > 2016);

        if (allCarsExpensive) {
            System.out.println("ВСЕ автомобили дороже 2 млн руб, имеют 1 владельца и год выпуска позже 2016");
        } else {
            System.out.println("НЕ все автомобили удовлетворяют условию: дороже 2 млн руб, 1 владелец и год выпуска позже 2016");
        }

        boolean noExpensiveCars = rusPriceCars.stream()
                .noneMatch(car -> car.getPrice() > 2000000
                        && car.getOwners() == 1
                        && car.getYearRelease() > 2016);

        if (noExpensiveCars) {
            System.out.println("Нет ни одного автомобиля с ценой > 2 млн руб, 1 владельцем и годом выпуска позже 2016");
        } else {
            System.out.println("Есть автомобили, удовлетворяющие условию: цена более 2 млн руб, 1 владелец и год выпуска позже 2016");
        }
    }
}
