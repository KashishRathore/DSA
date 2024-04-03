package Recursion.Recursion_Basic;

public class Print_x_pow_n_logn {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        // if n is even
        if (n % 2 == 0) {
            return power(x, n / 2) * power(x, n / 2);
        } else {
            return power(x, n / 2) * power(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int ans = power(2, 5);
        System.out.println(ans);
    }
}
