package org.example.multithreading.tasks;
public class ChopVegetables extends Thread {

    public void run() {
        System.out.println("Starting to chop vegetables..");
     //   System.out.println("[" + System.currentTimeMillis() + "] Chopping vegetables...");
        System.out.println("[" + java.lang.Thread.currentThread().getName() + "] Chopping vegetables...");


        try { java.lang.Thread.sleep(3000); } catch (InterruptedException e) { }
        System.out.println("[" + java.lang.Thread.currentThread().getName() + "] Vegetables are chopped!");
    }
}
