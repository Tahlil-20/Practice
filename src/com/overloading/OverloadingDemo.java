package com.overloading;

public class OverloadingDemo {

    public void display(Object obj){
        System.out.println("Object method called");
    }
    public void display(StringBuffer sbr){
        System.out.println("StringBuffer method called");
    }
    public void display(String string){
        System.out.println("String method called");
    }

    public static void main(String [] args){
        OverloadingDemo dem = new OverloadingDemo();
        dem.display("Tahlil");
        dem.display(new String("Tahlil"));
    }

}
