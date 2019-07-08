package com.company.basic;

public class ThreadDemo {

    public static void main(String[] args) {
        System.out.println("This is main thread " );
        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new java.lang.Thread() {
            public void run() {
                System.out.println("Anonymous thread");
            }
        }.start();

        new Thread(() -> System.out.println("lambda anonoymous class thread")).start();

        //Anonymous interface
       Runnable runnable = new Runnable() {
           @Override
           public void run() {
               System.out.println("This is runnable thread" );
           }
       };
        Thread t = new Thread(runnable);
       t.start();
    }
}
