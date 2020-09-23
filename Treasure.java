package treasure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Treasure {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of pirates: ");
        int n = sc.nextInt();
        int temp = n; // temp variable for reassigning n to its original value
        int[] total_sums = new int[n]; //array to display the total sums for each pirate
                                       //dynamicly allocated because of unknown N

        System.out.println("Enter Treasure Length: ");
        int list_length = sc.nextInt(); // to set the length of the list of treasures
        int treasures;
        List<Integer> treasure = new ArrayList();
        List<Integer> order_taken = new ArrayList(); // list to store the order of treasures taken

        System.out.println("Enter Treasure values: ");
        for (int i = 0; i < list_length; i++) { // loop to insert the treasure values into the list
            treasures = sc.nextInt();
            treasure.add(treasures);
        }

        for (int i = 0; i < list_length; i++) { // this loop iterates over the treasures list
            if (n == temp) { // in order to sum each pirates taken treasure, we must set N to zero.
                n = 0;       // so it will keep repeating until all treasures are taken.
            }
            if (treasure.get(0) > treasure.get(treasure.size() - 1)) { // Rule 1: The pirate takes the biggest integer on the left or right, unless equal, then we take right.
                order_taken.add(treasure.get(0));
                treasure.remove(0);
            } else if (treasure.get(0) < treasure.get(treasure.size() - 1)) {
                order_taken.add(treasure.get(treasure.size() - 1));
                treasure.remove(treasure.size() - 1);
            } else if (treasure.get(0) == treasure.get(treasure.size() - 1)) {
                order_taken.add(treasure.get(treasure.size() - 1));
                treasure.remove(treasure.size() - 1);
            }
            total_sums[n] += order_taken.get(i); // Here, I set the current pirates total treasure taken. 
            n++; // increase to move to next pirate
        }
        System.out.println("List of treasures taken in order: " + order_taken);
        for (int i = 0; i < total_sums.length; i++) { // loop to print final sums
            System.out.print(total_sums[i] + " ");
        }
        System.out.println("");
    }

}
