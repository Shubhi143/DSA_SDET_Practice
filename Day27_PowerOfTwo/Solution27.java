package Day27_PowerOfTwo;

public class Solution27 {
    public static void main(String[] args) {
        int n = 16; // Example input
        boolean result = isPowerOfTwo(n);
        System.out.println(n + " is a power of two: " + result);
        }
    public static boolean isPowerOfTwo(int n) {
        // A number is a power of two if it is greater than zero and
        // the bitwise AND of the number and its predecessor is zero.
        return n > 0 && (n & (n - 1)) == 0;
    }
}
