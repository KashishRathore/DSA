package Recursion.Recursion_Intermediate;

// Q -> Print all the unique subsequences of a String

import java.util.HashSet;

public class Unique_Subsequences {
    public static void subsequences(String str, int idx, String newString, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                set.add(newString);
                System.out.println(newString);
                return;
            }
        }

        char currChar = str.charAt(idx);

        //to be
        subsequences(str, idx+1, newString+currChar, set);

        //not to be
        subsequences(str, idx+1, newString, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set);
    }
}
