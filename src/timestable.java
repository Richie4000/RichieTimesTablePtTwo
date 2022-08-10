import java.util.Scanner;

public class timestable {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print
                // question
                ("What times table would you like? :");
        int timesTable = reader.nextInt();

        // number between 1 and 12
        // having problems trying to change number
        int N = 9;

        // loop from 1 to 12
        for (int i = 1; i <= 12; i++) {
            System.out.println(N + " * " + i + " = " + N * i );
        }
    }
}
