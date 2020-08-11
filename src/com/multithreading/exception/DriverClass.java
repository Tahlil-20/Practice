package com.multithreading.exception;

public class DriverClass {

    public static void main(String [] args){
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        t1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Poor Thread! " + t.getName() + "throws exception " + e.getMessage());
            }
        });
        t1.start();
        t2.start();
        System.out.println("Main Thread");
    }
}
