package Java;

import java.util.Scanner;

public class Functions_Methods {
    // Functions save in the form of stack at the memory(stack formation)

    // Printing Name
    public static void printMyName(String name) {
        System.out.println(name);
    }

    // Add two numbers
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // Add two numbers
    public static int calculateMultipl(int a, int b) {
        int multiply = a * b;
        return multiply;
    }

    // Factorial
    public static int calculateFactorial(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("Sum of Two numbers is : " + sum);

        int multiply = calculateMultipl(a, b);
        System.out.println("Multiply of Two numbers is : " + multiply);

        int n = sc.nextInt();
        int factorial = calculateFactorial(n);
        System.out.println("Factorial of number is : " + factorial);
    }
}
