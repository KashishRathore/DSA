public class Bit_Manipulation {
    public static void main(String[] args) {
        int n = 5;  //0101
        // Get Bit
            int pos = 2;
            int bitMask = 1 << pos;

            if((bitMask & n) == 0){
                System.out.println("Bit was zero");
            }
            else{
                System.out.println("Bit was one");
            }


        // Set Bit

            int pos1 = 1;
            int bitMask1 = 1 << pos1; 
            int newNumber = bitMask1 | n;
            System.out.println(newNumber); // 0111 --> (7)base 10


        // Clear Bit

           int pos2 = 2;
           int bitMask2 = 1 << pos2; 
           int notNumber = ~(bitMask2);
           int newNumber2 = notNumber & n;
           System.out.println(newNumber2); // 0001 --> (1)base10


        // Update Bit
           // Case 1 : To Convert to 1

           int pos3 = 1;
           int bitMask3 = 1 << pos3; 
           int newNumber3 = bitMask3 | n;
           System.out.println(newNumber3); // 0111 --> (7)base 10
           
           // Case 0 : To Convert to 0

           int pos4 = 2;
           int bitMask4 = 1 << pos4; 
           int notNumbe4 = ~(bitMask4);
           int newNumber4 = notNumbe4 & n;
           System.out.println(newNumber4); // 0001 --> (1)base10

    }
}
