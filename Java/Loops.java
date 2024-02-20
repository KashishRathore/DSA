import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /* 
        int n = 10;
        for(int i = 0 ; i <= n ; i++){
            //System.out.print(i + ".");
            //System.out.println("Hello World");
            System.out.print(i + " ");
        }


        int i = 0;
        while(i <= 10){
            System.out.print(i + " ");
            i++;
        }


        int j = 0;
        do{
            System.out.print(j + " "); 
            j++; 
        }while(j <= 10);

        */

        //sum of firrst n natural number
        int num = 4;
        int sum = 0;
        for(int k = 0 ; k <= num ; k++){
            sum += k;
        }
        System.out.println(sum);



        // Print the user input Table

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table ypu want to print : ");
        int number = sc.nextInt();

        for(int i = 1 ; i <= 10 ; i++){
            System.out.println( number + " * " + i + " = " + number*i);
        }
    }
}
