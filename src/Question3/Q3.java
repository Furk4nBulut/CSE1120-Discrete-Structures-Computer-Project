package Question3;

public class Q3 {
    public static int lucas(int n) {
        if (n == 0) {
            return 2;
        }
        if (n == 1) {
            return 1;
        }
        return lucas(n - 1) + lucas(n - 2);
    }
    public static void printLucas(int n) {
        int[] lucas = new int[n];
        lucas[0] = 2;
        lucas[1] = 1;
        for (int i = 2; i < n; i++) {
            lucas[i] = lucas(i);
        }
        for (int num : lucas) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        printLucas(10);
    }
}
