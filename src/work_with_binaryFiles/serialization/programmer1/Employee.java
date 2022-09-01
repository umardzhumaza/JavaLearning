package work_with_binaryFiles.serialization.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {
    static final long serialVersionUID = 1;
    String surName;
    String name;
    String department;
    int age;
    transient double salary;//Это поле не сериализуется
    Car car;

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                ", surName" + surName +
                '}';
    }

    public Employee(String surName,String name, String department,
                    int age,
                    double salary,Car car) {
        this.surName = surName;
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.car = car;

    }
}
