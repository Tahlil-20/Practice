package com.multipleinterfacesusingdefault;

public interface Interface1 {
    default void m1(){
        System.out.println("Interface 1");
    }

}
