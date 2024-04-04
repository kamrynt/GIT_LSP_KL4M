package org.howard.edu.lsp.assignment5;

import org.howard.edu.lsp.assignment5.IntegerSet.IntegerSetException;

public class Driver {
    public static void main(String[] args) {
        try { 
            IntegerSet set1 = new IntegerSet();
            for (int i = 1; i <= 10; i++) {
                set1.add(i);  // Building our first set
            
            // Displaying the set, its smallest, and largest elements—our first glimpse into its treasures.
            System.out.println("Value of Set 1 is: " + set1 + "\n");
            System.out.println("Smallest value in Set 1 is: " + set1.smallest()); 
            System.out.println("Largest value in Set 1 is: " + set1.largest() + "\n"); 
            
            // Removing elements from the set, like sculpting a statue to reveal its form.
            System.out.println("Removed 3 from Set 1.");
            set1.remove(3);
            System.out.println("New value of Set 1: " + set1 + "\n");
            
            System.out.println("Removed 8 from Set 1.");
            set1.remove(8);
            System.out.println("New value of Set 1: " + set1 + "\n");
            
            System.out.println("Remove 100 from Set 1. (An element not present, like reaching for a star not in our sky)");
            set1.remove(100);
            System.out.println("New value of Set 1: " + set1 + "\n");
            
            // Checking for emptiness, like listening for the echo in an empty hall.
            System.out.println("Is Set 1 Empty? (true/false): " + set1.isEmpty() + "\n");
            
            // Checking for presence of an element, like seeking a familiar face in a crowd.
            System.out.println("Does Set 1 contain 9? (true/false): " + set1.contains(9) + "\n");
            
            // Revealing the length of the set, like measuring the span of a bridge.
            System.out.println("Length of Set 1: " + set1.length() + "\n");
            
            // Resetting the set, a fresh canvas for the next masterpiece.
            set1.clear();
            for (int x= 1; x<= 10; x++) {
                set1.add(x);
            }
            IntegerSet set2 = new IntegerSet();
            for (int y = 0; y <= 20; y += 2) {
                set2.add(y);  // Constructing another set, this one with a rhythm of its own.
            }
            System.out.println("Value of Set 1 is: " + set1);
            System.out.println("Value of Set 2 is: " + set2);
            System.out.println("We will reset the values of each list after every test." + "\n");
            
            // Exploring the union of sets, like weaving two melodies into a harmony.
            System.out.println("Union of Set 1 and Set 2");
            set1.union(set2);    
            System.out.println(set1 + "\n");    
            
            // Resetting sets to explore the difference, like telling two sides of the same story.
            set1.clear();
            for (int z = 1; z <= 10; z++) {
                set1.add(z);
            }
            set2.clear();
            for (int k = 0; k <= 20; k += 2) {
                set2.add(k);
            }
            
            System.out.println("Difference of Set 1 and Set 2");
            set1.diff(set2); 
            System.out.println(set1 + "\n"); 
            set1.clear();
            for (int r = 1; r <= 10; r++) {
                set1.add(r);
            }
            set2.clear();
            for (int j = 0; j <= 20; j += 2) {
                set2.add(j);
            }
            
            System.out.println("Difference of Set 2 and Set 1");
            set2.diff(set1); 
            System.out.println(set2 + "\n"); 
            
            // Discovering the intersection of sets, like finding common ground.
            System.out.println("Intersection of Set 1 and Set 2");
            set1.intersect(set2); 
            System.out.println(set1 + "\n"); 
            
            // Inquiring about equality, like asking if two stories end the same way.
            System.out.println("Are Set 1 and Set 2 equal?");
            System.out.println(set1.equals(set2) + "\n");
            
            // Embracing the journey, even when it leads to an exception.
            System.out.println("Attempting to find the largest in an empty set...");
            set1.clear(); 
            try {
                set1.largest();
            } catch (IntegerSetException e) {
                System.out.println("Caught an exception: " + e.getMessage());
            }
         catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
            }
            
        }
    }

