package Recursion.Recursion_Intermediate;

// Q -> Print Keypad Combination
// 0 -> .
// 1 -> abc
// 2 -> def
// 3 -> ghi
// 4 -> jkl
// 5 -> mno
// 6 -> pqrs
// 7 -> tu
// 8 -> vwx
// 9 -> yz

public class Keypad_Combination {
    public static String[] keypad = { ".", "abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printComb(String str, int idx, String Combination){
        if(idx == str.length()){
            System.out.println(Combination);
            return;
        }
        
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for(int i = 0 ; i < mapping.length() ; i++){
            printComb(str, idx+1, Combination + mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23";
        printComb(str, 0, "");
    }
}
