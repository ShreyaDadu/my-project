public class fibo {
	
	public static boolean checkMember(int N){
        // Check if 5*N^2 + 4 or 5*N^2 - 4 is a perfect square
        return isPerfectSquare(5 * N * N + 4) || isPerfectSquare(5 * N * N - 4);
    }

    private static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    public static void main(String[] args) {
        // Test cases
        int N1 = 21;
        int N2 = 22;
        System.out.println("Is " + N1 + " a Fibonacci number? " + checkMember(N1)); // true
        System.out.println("Is " + N2 + " a Fibonacci number? " + checkMember(N2)); // false
    }
}
