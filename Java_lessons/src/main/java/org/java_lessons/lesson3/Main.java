package org.java_lessons.lesson3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("John");
        System.out.println(person.getFirstName());

        Person person1 = new Person("Иван", "Иванов");
        System.out.println(person1.getFirstName());

        // поле className принадлежит классу Person а не инстансах (объектах)
        // созданных на основе класса Person
        System.out.println(Person.className);

        // модификатор final
        final Person person2 = new Person();
        // Ошибка person2 не изменяемый, нельзя переписать
//        person2 = person;

        // переменная number неизменяемая - константа
        final int number = 100;
//        number = 1;

        final User user = new User("Петя", "Петров");
        System.out.println(user.getFirstName() + " " + user.getLastName());

        Calculator calculator = new CalculatorImpl();
        System.out.println(calculator.divide(10, 20));
        // повторить остальные операции

        Animal dog = new Dog();
        dog.setName("Барсик");
        dog.setSound("Гаф");
        dog.eat();
        dog.sleep();
        System.out.println(dog.getName());
        System.out.println(dog.getSound());
    }
}
