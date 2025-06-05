package Day32_NumbersOfCoinYouGet;

public class Solution32 {
    public static void main(String[] args) {
        int[] piles = {2,4,1,2,7,8};
       
       int result=maxCoins(piles);
        System.out.println("Maximmum number of coins needed: " + result);
    }
    public static int maxCoins(int[] piles){
        if (piles == null || piles.length < 3) {
            return 0; // Not enough piles to form a valid selection
        }
        
        int n = piles.length;
        int maxCoins = 0;
        
        // Sort the piles in ascending order
        java.util.Arrays.sort(piles);
        
        // Select the second largest pile from the end, skipping the largest one
        for (int i = n - 2; i > n / 3 - 1; i -= 2) {
            maxCoins += piles[i];
        }
        
        return maxCoins; // Return the total number of coins collected
    }
    
}
