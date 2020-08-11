package com.datastructure.hashmap.equalsMethod;

import java.util.Date;

public class Employee {

    public Employee(String name, Date dob, int age) {
        this.name = name;
        this.dob = dob;
        this.age = age;
    }

    public Employee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    String name;
    Date dob;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return age == employee.age &&
            name.equals(employee.name) &&
            dob.equals(employee.dob);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
