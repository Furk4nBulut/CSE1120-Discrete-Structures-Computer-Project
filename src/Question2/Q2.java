package Question2;
import java.util.*;
public class Q2 {
    public static boolean isOneToOne(int[] f) {
        HashSet<Integer> outputs = new HashSet<>();
        for (int i = 0; i < f.length; i++) {
            if (outputs.contains(f[i])) {
                return false;
            }
            else {
                outputs.add(f[i]);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {20, 21, 22, 23, 24, 25, 26};
        int n = 100;
        int count = 0;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int[] f = new int[A.length];
            for (int j = 0; j < A.length; j++) {
                f[j] = B[random.nextInt(B.length)];
            }
            if (isOneToOne(f)) {
                count++;
            }
        }
        System.out.println("Out of " + n + " random functions from A to B, " + count + " are one to one.");
    }
}
