import java.util.Scanner;

public class diamondofstars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Validate that N is odd
        if (N % 2 == 0) {
            System.out.println("Please enter an odd number.");
            return;
        }

        int mid = (N / 2) + 1;

        // Upper half of the diamond (including the middle line)
        for (int i = 1; i <= mid; i++) {
            // Print leading spaces
            for (int j = 1; j <= mid - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = mid - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= mid - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
