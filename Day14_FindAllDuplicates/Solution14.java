package Day14_FindAllDuplicates;

public class Solution14 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Input array: " + java.util.Arrays.toString(nums));
        System.out.println("Duplicates: " + findDuplicates(nums));  
        }
    public static java.util.List<Integer> findDuplicates(int[] nums) {
        java.util.List<Integer> duplicates = new java.util.ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // Use absolute value to find the index
            if (nums[index] < 0) {
                duplicates.add(index + 1); // If the value at this index is negative, it means we've seen this number before
            } else {
                nums[index] = -nums[index]; // Mark this number as seen by negating the value at its index
            }
        }
        return duplicates; // Return the list of duplicates
    }
}
