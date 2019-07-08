package com.company.basic;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        Thread.currentThread().setName("Another thread");
        System.out.println("This is another thread " + Thread.currentThread().getName());
    }
}
