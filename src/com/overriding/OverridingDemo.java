package com.overriding;

public class OverridingDemo {

    public static void main(String [] args){
        BaseClass cl = new ChildClass();
        BaseClass cq = new BaseClass();
        cl.display();
        cq.display();
    }
}
