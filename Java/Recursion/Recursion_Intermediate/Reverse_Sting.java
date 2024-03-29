package Recursion.Recursion_Intermediate;

// Q -> Reversing the string abcd

public class Reverse_Sting {
    public static void strReverse(String str , int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        strReverse(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
         strReverse(str, str.length()-1);
    }
}

