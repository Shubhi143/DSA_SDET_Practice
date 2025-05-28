package Day15_MajorityElement;

public class Solution15 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int result = majorityElement(nums);
        System.out.println("The majority element is: " + result);
        }
    public static int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num; // Set the candidate to the current number
            }
            count += (num == candidate) ? 1 : -1; // Increment or decrement the count
        }

        return candidate; // Return the majority element
        }
    }

