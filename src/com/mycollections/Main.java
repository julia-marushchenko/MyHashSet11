/**
 *  Java program to create a collection with unique digits.
 */

package com.mycollections;

import java.util.HashSet;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating a HashSet instance.
        HashSet<Double> mySet = new HashSet<>();

        // Add.
        mySet.add(4.8);
        mySet.add(3.9);
        mySet.add(1.8);
        mySet.add(5.7);
        mySet.add(6.7);
        mySet.add(4.2);

        // Display.
        System.out.println(mySet); // Output: [4.8, 1.8, 6.7, 5.7, 3.9, 4.2]

        // Remove.
        System.out.println(mySet.remove(6.7)); // Output: true

        // Display.
        System.out.println(mySet); // Output: [4.8, 1.8, 5.7, 3.9, 4.2]

        // Delete all.
        mySet.clear();

        // Checking that mySet does not contain any elements.
        System.out.println(mySet.isEmpty()); // Output: true

    }
}
