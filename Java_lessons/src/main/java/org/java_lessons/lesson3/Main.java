
package ru.lessons.lesson3;

import org.java_lessons.lesson3.Person;
import org.java_lessons.lesson3.User;

public class Main {
    public static void main(String[] args) {
        final var person = new Person();
        person.setFirstName("John");
        final String name = person.getFirstName();
        //System.out.println(name);

        final Person person1 = new Person("Иван", "Иванов");
        final String name1 = person1.getFirstName();
        person1.setAge(22);
        final int age = person1.getAge();
        person1.voice();
        //System.out.println(name1);

        // поле className принадлежит классу Person а не инстансах (объектах)
        // созданных на основе класса Person
        //System.out.println(Person.className);

        // модификатор final
        final Person person2 = new Person();
        // Ошибка person2 не изменяемый, нельзя переписать
//        person2 = person;

        // переменная number неизменяемая - константа
        final int number = 100;
//        number = 1;

        final User user = new User("Петя", "Петров");
        //System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getPassword());

        ru.lessons.lesson3.Calculator calculator = new ru.lessons.lesson3.CalculatorImpl();
        calculator.print();
        System.out.println(calculator.subtract(100, 10));

        ru.lessons.lesson3.Calculator jewishCalc = new ru.lessons.lesson3.JewishCalculatorImpl();
        jewishCalc.print();
        System.out.println(jewishCalc.subtract(100, 10));



    }
}
