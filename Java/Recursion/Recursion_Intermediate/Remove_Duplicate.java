package Recursion.Recursion_Intermediate;

// Q -> Remove all the duplicate characters and print the output

public class Remove_Duplicate {
    public static boolean map[] = new boolean[26]; // As alpabets has 26 character

    public static void removeDuplicate(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDuplicate(str, idx+1, newString);
        }
        else{
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicate(str, 0, "");
    }
}
