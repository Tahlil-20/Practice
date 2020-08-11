package com.multipleinterfacesusingdefault;

public class InterfaceImpl implements Interface1, Interface2 {

    @Override
    public void m1() {
        System.out.println("Its own implementation");
    }

   /* @Override
    public void m1() {
        *//*Interface2.super.m1();
        System.out.println(Interface2.i);*//*

    }*/
}

