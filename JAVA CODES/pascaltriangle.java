
import java.util.Scanner;
public class pascaltriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Loop to generate Pascal's Triangle
        for (int i = 0; i < N; i++) {
            // Print leading spaces for alignment
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Calculate and print values in the row
            int value = 1; // Starting value of each row
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1); // Update the value using binomial coefficient formula
            }

            // Move to the next line
            System.out.println();
        }
    }
}
