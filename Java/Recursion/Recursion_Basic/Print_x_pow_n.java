package Recursion.Recursion_Basic;

public class Print_x_pow_n {
    public static int power(int x , int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
         int xPownm1 = power(x, n-1);
         int xPown = x * xPownm1;
        System.out.println("Step wise -> " + xPown);
         return xPown;
    }
    public static void main(String[] args) {
        int ans = power(2,5);
        System.out.println(ans);
    }
}
