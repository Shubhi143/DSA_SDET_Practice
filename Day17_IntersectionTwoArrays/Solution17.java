package Day17_IntersectionTwoArrays;

public class Solution17 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = intersection(nums1, nums2);
        System.out.print("The intersection of the two arrays is: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        }
    public static int[] intersection(int[] nums1, int[] nums2) {
        java.util.HashSet<Integer> set1 = new java.util.HashSet<>();
        java.util.HashSet<Integer> set2 = new java.util.HashSet<>();
        
        // Add elements of nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }
        
        // Add elements of nums2 to set2
        for (int num : nums2) {
            set2.add(num);
        }
        
        // Find intersection
        set1.retainAll(set2);
        
        // Convert the result to an array
        int[] result = new int[set1.size()];
        int index = 0;
        for (int num : set1) {
            result[index++] = num;
        }
        
        return result; // Return the intersection as an array
    }
}
