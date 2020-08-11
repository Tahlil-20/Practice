package com.datastructure.hashmap.equalsMethod;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String [] args){
        Map<Employee, Integer> map = new HashMap<>();
        Employee emp = new Employee("Hashmat", new Date(1992,01,23));
        Employee emp2 = new Employee("Hashmat", new Date(1992,01,23));
        System.out.println(emp.equals(emp2));

    }

}
