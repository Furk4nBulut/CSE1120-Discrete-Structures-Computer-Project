package Question1;

public class Q1 {
    public static void main(String[] args) {
        Q1 q1 = new Q1();
        System.out.println(q1.validation(5));
    }
    public int validation(int input) {
        //1 + 2 + 2^2+2^3 + .... + 2^n = 2^(n+1) - 1
        int sum = 0;
        for (int i = 0; i <= input; i++) {
            sum += Math.pow(2, i);
        }
        return sum;

    }
}
