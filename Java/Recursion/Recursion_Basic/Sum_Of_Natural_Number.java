package Recursion.Recursion_Basic;

//Q -> Print sum of n natural number

public class Sum_Of_Natural_Number {
    public static void printSum(int i , int n , int sum){
       if(i == n){
        sum += i;
        System.out.println(sum);
        return;
       }
       sum += i;
       printSum(i+1, n, sum);
    }
    public static void main(String[] args) {
        printSum(1 , 5 , 0);
    }
}
