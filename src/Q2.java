import java.util.*;

public class Q2 {

    // A helper method that checks if a function is one to one
    public static boolean isOneToOne(int[] f) {
        // Use a hash set to store the outputs
        HashSet<Integer> outputs = new HashSet<>();
        // Loop through the function array
        for (int i = 0; i < f.length; i++) {
            // If the output is already in the set, return false
            if (outputs.contains(f[i])) {
                return false;
            }
            // Otherwise, add it to the set
            else {
                outputs.add(f[i]);
            }
        }
        // If no duplicates are found, return true
        return true;
    }

    // A main method that generates random functions and counts how many are one to one
    public static void main(String[] args) {
        // Define the domain and codomain sets
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {20, 21, 22, 23, 24, 25, 26};
        // Define the number of functions to generate
        int n = 100;
        // Initialize a counter for one to one functions
        int count = 0;
        // Use a random object to generate random numbers
        Random random = new Random();
        // Loop n times
        for (int i = 0; i < n; i++) {
            // Create an array to store the function
            int[] f = new int[A.length];
            // Loop through the domain set
            for (int j = 0; j < A.length; j++) {
                // Assign a random element from the codomain set as the output
                f[j] = B[random.nextInt(B.length)];
            }
            // Check if the function is one to one and increment the counter if yes
            if (isOneToOne(f)) {
                count++;
            }
        }
        // Print out the result
        System.out.println("Out of " + n + " random functions from A to B, " + count + " are one to one.");
    }
}
