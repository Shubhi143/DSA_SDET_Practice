package Day28_HammingDistance;

public class Solution28 {
    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        int result = hammingDistance(x, y);
        System.out.println("The Hamming distance between " + x + " and " + y + " is: " + result);
        }
    public static int hammingDistance(int x, int y) {
        int xor = x ^ y; // XOR operation to find differing bits
        int distance = 0;

        // Count the number of set bits in the XOR result
        while (xor > 0) {
            distance += (xor & 1); // Increment distance if the least significant bit is set
            xor >>= 1; // Right shift to check the next bit
        }

        return distance; // Return the Hamming distance
    }
}
