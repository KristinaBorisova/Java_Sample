package org.example.interview.topics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    //private function for calculations
    private static int calculateBoatSize(int maxBoatCourses, int totalSheepWeight, ArrayList <Integer> sheepWeightList) {
        //Boat Size = totalSheepWeight / maxBoatCourses
        int boatSize = totalSheepWeight / maxBoatCourses;
        //TODO optimalBoatSize = From Sorted List of sheep weight remove the elements that add up most closely to boat size
        //TODO and add constrain for the naxBoatCourses that we can do -> Divide in batches
        Collections.sort(sheepWeightList);
        return boatSize;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        //Input 1 - 1<= N <= 1000 (Number of sheep); 1<= K <= 1000  (Max Ship Courses);
        int N = 0, K = 0;
        //Optimal Boat Size
        int optimalBoatSize = 0;
        // Sum of weight of all sheep
        int totalSheepWeight = 0;

        // Input 2 - N times Weight of sheep
        ArrayList <Integer> sheepWeightList = new ArrayList<>();

        //------ User Input ------
        try {
            System.out.println(" Please enter: (1) the number of sheep and (2) number of courses:");
            do {
                N = userInput.nextInt();
                K = userInput.nextInt();
            } while ((N < 1 || N >1000) && (K <1 || K >1000));

        } catch (Exception e)
        {
            System.out.println("Wrong Input, please try again!");
        }

        //Input 2: Weight of sheep
        System.out.println(" Please enter the weight of all sheep:");
        for (int i=0; i<N; i++) {
            int sheepWeight = userInput.nextInt();
            if(sheepWeight <1 || sheepWeight >100000) {
                System.out.println(" Input out of scope, please enter a new value between 1 and 1000");
                sheepWeight = userInput.nextInt();
            }
            else {
                sheepWeightList.add(sheepWeight);
                totalSheepWeight+=sheepWeight;
            }
        }

        // Output : Max Size of Ship
        optimalBoatSize = calculateBoatSize(K, totalSheepWeight, sheepWeightList);
        System.out.println("Boat Size:" + optimalBoatSize);

    }
}
