package org.example.multithreading;

import org.example.multithreading.tasks.BoilWater;
import org.example.multithreading.tasks.ChopVegetables;
import org.example.multithreading.tasks.PrepareTable;

public class KitchenSimulationMain {
    public static void main(String[] args) {
        BoilWater task1 = new BoilWater();
        ChopVegetables task2 = new ChopVegetables();
        PrepareTable task3 = new PrepareTable();

        //Multitreading in action ;)
        task1.start();
        task2.start();
        task3.start();
    }
}
