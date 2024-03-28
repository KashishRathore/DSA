package Recursion.Recursion_Basic;

// Q -> Print the number from 5 to 1

public class Print_1_to_5 {
    public static void printNumb(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        printNumb(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        printNumb(n);
    }
}
