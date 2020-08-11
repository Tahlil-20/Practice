package com.multipleinterfacesusingdefault;

public interface Interface2 {
    int i=0;
    default void m1(){
        System.out.println("Interface 2");
    }

}
