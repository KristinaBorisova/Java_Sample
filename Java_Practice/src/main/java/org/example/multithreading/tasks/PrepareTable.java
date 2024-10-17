package org.example.multithreading.tasks;
public class PrepareTable extends Thread {
    public void run() {
        System.out.println("Starting to prepare Table for guests..");
       // System.out.println("[" + System.currentTimeMillis() + "] Preparing Table...");
        System.out.println("[" + java.lang.Thread.currentThread().getName() + "] Preparing Table...");

        try { java.lang.Thread.sleep(3000); } catch (InterruptedException e) { }
        System.out.println("[" + java.lang.Thread.currentThread().getName() + "] Table is Prepared!");

    }

}
