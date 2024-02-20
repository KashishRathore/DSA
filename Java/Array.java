import java.util.*;

public class Array {
    public static void main(String[] args) {
        // type arrayName[] = new type[size]
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

        int studentMarks[] = {96 , 88 , 97 , 89 , 67};
        // System.out.println(marks);


        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);

        for( int i = 0 ; i < 3 ; i++ ){
            System.out.println(marks[i]);
            System.out.println(studentMarks[i]);
        }

        //Taking array as input from user. Search for a given x and print the index at which it occurs

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        for(int i = 0 ; i < size ; i++){
            number[i] = sc.nextInt();
        }

        System.out.println("Enter the x");
        int x = sc.nextInt();

        for(int i = 0 ; i < number.length ; i++){
            if (number[i] == x) {
                System.out.println("x found at index :"+i);
            }
        }
    }
}
