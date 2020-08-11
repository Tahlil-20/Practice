package com.multithreading.exception;

public class Thread1 implements Runnable {


    @Override
    public void run() {
        throw new RuntimeException("Exception in thread 1");
    }
}
