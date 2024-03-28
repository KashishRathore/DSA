package Recursion.Recursion_Basic;

// Q -> Print Factorial of a number n

public class Factorial {
    // Method 1
    public static void printFact(int i, int n, int fact) {
        if (i == n) {
            fact *= i;
            System.out.println(fact);
            return;
        }
        if (n == 1 || n == 0) {
            System.out.println("1");
        }
        fact *= i;
        printFact(i + 1, n, fact);
    }

    // Method 2
    public static int printFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_nm1 = printFactorial(n - 1); // called till 1 then return from base condition
        int fact = n * fact_nm1; // after returned from the base condition then work start to calculate fact
        System.out.println("Step wise -> " + fact);
        return fact;
    }

    public static void main(String[] args) {
        // Method 1
        printFact(1, 5, 1);

        // Method 2
        int ans = printFactorial(5);
        System.out.println(ans);
    }

}
