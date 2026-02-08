package org.java_lessons.lesson4;

public class SAImpl implements Employee1 {
    private String name;
    private String task;
    private double salary;

    public SAImpl( double salary, String task, String name) {
        this.task = task;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getTask() {
        return task;
    }

    @Override
    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void doTask() {
        System.out.println("Следующая задача - правки в аналитике");

    }
}


