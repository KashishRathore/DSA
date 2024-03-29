package Recursion.Recursion_Intermediate;

//Q -> Print all the subsequences of a string
//Order should be follow and give choice to character whether came and when not

public class Subsequences {
    public static void subsequence(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
         char currChar = str.charAt(idx);
         //to be
         subsequence(str, idx+1, newString+currChar);
         
         //not to be
         subsequence(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsequence(str, 0, "");
    }
}
