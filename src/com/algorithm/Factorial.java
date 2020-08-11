package com.algorithm;

public class Factorial {

    public static void main(String [] args){
        printFactorial(8);
    }

    private static void printFactorial(int n) {
        int factorial = 1;
        for(int i = n; i>0; i--){

            factorial = factorial *i;
            System.out.println(factorial);
            System.out.println(i);
        }
        System.out.println(factorial);
    }

}
