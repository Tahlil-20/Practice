package com.datastructure.stack.specialstack;

public class SpecialStackDriver {
    public static void main(String [] args){
        SpecialStack s =  new SpecialStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.getMin());
        s.push(5);
        System.out.println(s.getMin());
    }

}
