import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();   // for line
        System.out.println("Your name is : " + name);

        //Concatenation
        String firstname = "Kashish ";
        String lastname = "Rathore";
        String fullname = firstname + lastname ;
        System.out.println("Your name is : " + fullname);

        //Length 
        System.out.println("Length of String : " + fullname.length());

        //charAt
        for(int i = 0 ; i<fullname.length() ; i++){
            System.out.println(fullname.charAt(i));
        }
        
        //compareTo()
        if(firstname.compareTo(lastname) == 0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        //subString
        String sentence = "My name is Kashish" ; 
        String subStr = sentence.substring(7);
        //String subStr = sentence.substring(7, sentence.length());
        System.out.println(subStr);
    }
}
