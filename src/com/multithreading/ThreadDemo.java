package com.multithreading;

public class ThreadDemo implements Runnable {


    @Override
    public void run() {
        lockThread();
    }

    private void lockThread() {


        synchronized (this) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("in block "
                + Thread.currentThread().getName());
            System.out.println("in block " +
                Thread.currentThread().getName() + " end");
        }
    }

    public static void main(String[] args)
    {
        ThreadDemo g = new ThreadDemo();
        Thread t1 = new Thread(g);
        Thread t2 = new Thread(g);
        ThreadDemo g1 = new ThreadDemo();
        Thread t3 = new Thread(g1);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
