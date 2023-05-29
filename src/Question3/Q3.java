package Question3;

public class Q3 {
    // A recursive method to generate the nth Lucas number
    public static int lucas(int n) {
        // Base cases
        if (n == 0) {
            return 2;
        }
        if (n == 1) {
            return 1;
        }
        // Recursive case;
        return lucas(n - 1) + lucas(n - 2);
    }

    // A method to print the first n Lucas numbers using a foreach loop
    public static void printLucas(int n) {
        // Create an array to store the Lucas numbers
        int[] lucas = new int[n];
        // Initialize the first two elements
        lucas[0] = 2;
        lucas[1] = 1;
        // Generate the rest of the elements using the recursive method
        for (int i = 2; i < n; i++) {
            lucas[i] = lucas(i);
        }
        // Print the array using a foreach loop
        for (int num : lucas) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        // Print the first 10 Lucas numbers
        printLucas(10);
    }
}
