package Recursion.Recursion_Basic;

// Q -> Print Factorial of a number n

public class Factorial {
    //Method 1
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

    public static void main(String[] args) {
    //Method 1
        printFact(1, 5, 1);

    }
}
