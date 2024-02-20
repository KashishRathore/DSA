import java.util.*;

public class Conditional_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You cannot vote");
        }
     


        int x = sc.nextInt();
        if(x % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    

        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b){
            System.out.println("Equal");
        }
        else if(a > b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
        */



        int button = sc.nextInt();
        switch (button) {
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid Button");
            break;
        }

    }
}
