import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type Technological "); //user types in Technological
        char[] letters = reader.nextLine().toCharArray();

        String str = "Technological", instr="";
        char ch;

        System.out.print("Original word: "); // original word
        System.out.println("Technological");

        for (int i=0; i<str.length(); i++) // for loops
        {
            ch= str.charAt(i);
            instr= ch+instr; //strings
        }
        // reverse word printed
        System.out.println("Reversed word: "+ instr);


    }
}
