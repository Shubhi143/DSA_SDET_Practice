package Day08_TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution8 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println("Indices of the two numbers that add up to " + target + ": [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two numbers add up to " + target);
        }
        }
    public static int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(mp.containsKey(complement)){
                return new int[]{mp.get(complement),i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{-1,-1}; // If no solution is found
    }
}
