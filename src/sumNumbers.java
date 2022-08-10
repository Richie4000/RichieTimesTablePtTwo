import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // user places their input
        System.out.println("Input a number to sum to: ");
    int SumTo = reader.nextInt();

    SumTo = 1;
            while (SumTo < 20)
            {
                System.out.print("value of SumTo: "  + SumTo);
                SumTo++;
                System.out.println("\n");
            }

    }
}
