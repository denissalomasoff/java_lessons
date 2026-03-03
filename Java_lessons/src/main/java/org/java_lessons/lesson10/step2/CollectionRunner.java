package ru.lessons.lesson10.step2;

import org.java_lessons.lesson10.step2.Person;

import java.time.LocalDate;
import java.util.*;

public class CollectionRunner {
    public static void main(String[] args) {
        // смотрим все методы Collection
        final List<Integer> list = new ArrayList<>(20);
        list.add(100); // 0
        list.add(200); // 1
        list.add(300); // 2
        list.add(400);

        final List<Integer> list2 = new ArrayList<>();
        list2.add(1000);
        list2.add(2000);
        list.addAll(list2);
        list.add(0, 10505);

        // Поиск элемента по индексу O(1)
        // Вставка в конец списка O(1)
        // Вставка в начало или средину O(N)

        List<String> linkedList = new LinkedList<>();
        // Поиск элемента по индексу O(N)
        // Вставка в конец списка O(1)
        // Вставка в начало O(1)
        // Вставка в средину O(N)
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.remove("a");

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Petya", 15, LocalDate.of(1990, 1, 1)));
        personList.add(new Person("Masha", 17, LocalDate.of(1997, 1, 1)));
        personList.add(new Person("Ivan", 20, LocalDate.of(1998, 1, 1)));
        personList.add(new Person("Abram", 30, LocalDate.of(2000, 1, 1)));
        personList.add(new Person("John", 40, LocalDate.of(2007, 1, 1)));

//        List<Person> adultList = new ArrayList<>();
        // ConcurrentModificationException
//        for (Person person : personList) {
//            if (person.age() >= 18) {
//                personList.remove(person);
//            }
//        }
        final var result = new ArrayList<Person>();
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).age() >= 18) {
                result.add(personList.get(i));
            }
        }


        System.out.println(list);
    }
}
