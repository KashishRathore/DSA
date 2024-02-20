import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
        //Taking array as input from user. Search for a given x and print the index at which it occurs

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int matrix[][] = new int[row][column];

        //Input
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the x");
        int x = sc.nextInt();

        //Output
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                if(matrix[i][j] == x){
                    System.out.print("x found at location (" + i + ", " + j + ")"); 
                }
            }
        }
    }
}
