package com.multithreading.exception;

public class Thread2 implements Runnable {

    @Override
    public void run() {
        System.out.println("I am safe");
    }
}
