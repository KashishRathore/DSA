package Recursion.Recursion_Advanced;

// Q -> Find the number of ways in which you can invite n people to your part, single or in pairs
// n = 4

public class Invite_Guests {
    public static int callGuests(int n) {
        if (n <= 1) {
            return 1;
        }

        // single
        int way1 = callGuests(n - 1);

        // pairs
        int way2 = (n - 1) * callGuests(n - 2);

        return way1 + way2;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(callGuests(n));
    }
}
