package Day13_MissingNumber;

public class Solution13 {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int result = missingNumber(nums);
        System.out.println("The missing number is: " + result);
        }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num; // Calculate the sum of the elements in the array
        }

        return expectedSum - actualSum; // The missing number is the difference
        
    }
}
