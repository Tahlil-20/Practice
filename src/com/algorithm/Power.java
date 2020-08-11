package com.algorithm;

public class Power {
    public static void main(String [] args){

        int value = power(2, 5);
        if(value != -1) {
            System.out.println(value);
        }
        else{
            System.out.println("Uncomputable!");
        }
    }

    private static int power(int number, int power) {
        int result = 1;
        if(number<=0){
            return -1;
        }
        for(int i=1; i<=power; i++){
            result = number*result;
        }
        return result;
    }
}


