package Day12_FindDuplicateNumber;

public class Solution12 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,5};
        int result = findDuplicate(nums);
        System.out.println("The duplicate number is: " + result);
    }
    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Finding the intersection point
        do {
            slow = nums[slow]; // Move slow pointer by 1 step
            fast = nums[nums[fast]]; // Move fast pointer by 2 steps
        } while (slow != fast);

        // Phase 2: Finding the entrance to the cycle
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow; // The duplicate number
    }
}
