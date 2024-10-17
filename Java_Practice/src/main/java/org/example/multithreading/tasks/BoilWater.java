package org.example.multithreading.tasks;

public class BoilWater extends Thread {

    public void run() {
        System.out.println("Starting to Boil Water..");
        System.out.println("[" + java.lang.Thread.currentThread().getName() + "] Boiling water...");

        //simulating the time it takes to boil water
        try { java.lang.Thread.sleep(3000); } catch (InterruptedException e) { }
        System.out.println("[" + java.lang.Thread.currentThread().getName() + "] Water is boiled!");

    }
}
