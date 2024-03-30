package Recursion.Recursion_Advanced;

// Q -> Place Tiles of size 1 * m in a floor of size n*m
// n = 4 , m = 2

public class Place_Tiles {

    public static int placeTiles(int n, int m){
        if( n == m){
            return 2;
        }

        if(n < m){
            return 1;
        }

        // Vertically
        int verticalPlacements = placeTiles(n-m,m);

        //Horizontally
        int horizontalPlacement = placeTiles(n-1, m);

        return verticalPlacements + horizontalPlacement ;
    }
    public static void main(String[] args) {
        int n = 4 , m = 2;
        System.out.println(placeTiles(n, m));
    }
}
