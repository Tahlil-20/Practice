package com.staticblock;

public class StaticVsInitializerBlock {
    {
        System.out.println("Empty block");
    }
    StaticVsInitializerBlock(){
        System.out.println("Constructor Called");
    }
    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        StaticVsInitializerBlock t = new StaticVsInitializerBlock();
        StaticVsInitializerBlock t1 = new StaticVsInitializerBlock();
       // print();
    }
}
