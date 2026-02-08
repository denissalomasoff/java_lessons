package org.java_lessons.lesson4;

//1. Создать интерфейс Employee с абстрактными методами:
//а) void doTask(String taskName);
//b) double getSalary();
//c) void setTask(String taskName);
//d) String getName();
//e) String getTask();
//1.2. Имплементировать интерфейс Employee в классах QA, SystemAnalitic, BusinessAnalitic, Developer;
//1.3. В классе EmployeeExecutor создать все типы объектов QA, SystemAnalitic, BusinessAnalitic, Developer и вызвать методы:
//a) добавить задачу на выполнение;
//б) посмотреть задачу работника;
//в) вывести – имя работника + таска + зп;

public interface Employee1 {
    void doTask();
    void setTask(String taskName);

    String getName();
    String getTask();
    double getSalary();
}
