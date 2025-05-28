# Day10 RemoveDuplicatesSortedArray

- [ ] Problem link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
- [ ] Problem description: Given a sorted array, remove the duplicates in an efficient manner.
- [ ] Example 1:
- Input: nums = [1,1,2]
- Output: [1,2]
- Explanation: Your function should return length = 2, with the first two elements of nums being    
1 and 2 respectively.

- [ ] Approach:
- We will use two pointers, one at the beginning of the array and one at the
end. We will iterate through the array, and whenever we find a new element, we
will move the end pointer to the new element and copy the new element to the end
pointer. We will keep track of the number of unique elements.

- [ ] Code:
Solution10.java

- [ ] Time & Space Complexity:
- Time complexity: O(n)
- Space complexity: O(1)

