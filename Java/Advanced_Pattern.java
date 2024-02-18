package Java;
public class Advanced_Pattern {
    public static void main(String[] args) {
        System.out.println(" Butterfly Rhombus");
        int n = 5;
        //upper half
        for(int i = 1 ; i <= n ; i++){
            //1st Part
            for(int j = 1; j <= i ; j++){
                System.out.print(" * ");
            }

            //spaces
            int spaces = 2 * (n-i);
            for(int j = 1 ; j <= spaces ; j++){
                System.out.print("   ");
            }

            //2nd part
            for(int j = 1; j <= i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        //lower half
        for(int i = n ; i >= 1 ; i--){
            //1st Part
            for(int j = 1; j <= i ; j++){
                System.out.print(" * ");
            }
            //spaces
            int spaces = 2 * (n-i);
            for(int j = 1 ; j <= spaces ; j++){
                System.out.print("   ");
            }

            //2nd part
            for(int j = 1; j <= i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }


        System.out.println("--------------------------");
        System.out.println(" Solid Rhombus");
        for(int i = 1 ; i <= n ; i++){
            //spaces
            for(int j = 1 ; j <= n-i ; j++){
               System.out.print("   ");
            }

            //stars
            for(int j = 1 ; j <= 5 ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }


        System.out.println("--------------------------");
        System.out.println("Number Pyramid");
        for(int i = 1 ; i <= n ; i++){
            //spaces
            for(int j = 1 ; j <= n-i ; j++){
               System.out.print(" ");
            }

            //numbers
            for(int j = 1 ; j <= i ; j++){
                System.out.print(i + " ");
             }
           System.out.println();
        }

        System.out.println("--------------------------");
        System.out.println("Palindrome Pattern");
        for(int i = 1 ; i <= 5 ; i++){

            //spaces
            for(int j = 1 ; j <= 5-i ; j++){
                System.out.print("  ");
            }
 
            //Backward
            for(int j=i ; j >= 1 ; j-- ){
                System.out.print(j + " ");
            }

            //Forward
             for(int j=2 ; j <= i ; j++){
                System.out.print(j + " ");
            }

            System.out.println();
        }

        System.out.println("--------------------------");
        System.out.println("Diamond Pattern");
        // 1st half
        for(int i = 1 ; i <= 4 ; i++){
            //spaces
            for(int j = 1 ; j <= 4-i ; j++ ){
                System.out.print("   ");
            }

            for(int j = 1 ; j <= (2*i)-1 ; j++){
                System.out.print(" * ");
            }
         System.out.println();
        }

        // 2nd half
        for(int i = 3 ; i >= 1 ; i--){
            //spaces
            for(int j = 1 ; j <= 4-i ; j++ ){
                System.out.print("   ");
            }

            for(int j = 1 ; j <= (2*i)-1 ; j++){
                System.out.print(" * ");
            }
         System.out.println();
        }
        
    }
}
