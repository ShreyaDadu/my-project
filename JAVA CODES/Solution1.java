public class Solution1 {
    public static int findGCD(int x, int y) {
        // Ensure both numbers are positive
        x = Math.abs(x);
        y = Math.abs(y);

        // Apply Euclidean algorithm
        while (y != 0) {
            int temp = y;
            y = x % y; // Remainder of x divided by y
            x = temp;
        }

        return x; // GCD is stored in x
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("GCD of 48 and 18: " + findGCD(48, 18)); // 6
        System.out.println("GCD of 101 and 103: " + findGCD(101, 103)); // 1
        System.out.println("GCD of -48 and 18: " + findGCD(-48, 18)); // 6
    }
}
