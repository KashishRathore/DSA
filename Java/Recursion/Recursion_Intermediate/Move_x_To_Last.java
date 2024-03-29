package Recursion.Recursion_Intermediate;

// Q -> Move all 'x' to the end of the string
 
public class Move_x_To_Last {
    public static void moveAllx(String str, int idx, String newStr, int count){
        if(idx == str.length()-1){
            for(int i = 0; i<count; i++){
               newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
         char currChar = str.charAt(idx);
         if(currChar == 'x'){
            count++;
            moveAllx(str, idx+1, newStr, count);
         }
         else{
            newStr += currChar;
            moveAllx(str, idx+1, newStr, count);
         }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllx(str, 0, "", 0);
    }
}
