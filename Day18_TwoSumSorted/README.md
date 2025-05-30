# Day18 TwoSumSorted

- [ ] Problem link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
- [ ] Problem description: Given a 1-indexed array `nums` of length `n
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.

 

Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

- [ ] Approach:
- [ ] Initialize two pointers, one at the start and one at the end of the array
- [ ] Compare the sum of the values at the two pointers with the target
- [ ] If the sum is equal to the target, return the indices of the two pointers
- [ ] If the sum is less than the target, move the left pointer to the right
- [ ] If the sum is greater than the target, move the right pointer to the left
- [ ] Repeat the process until the two pointers meet
- [ ] If the two pointers meet without finding a solution, return an empty array
- [ 
- [ ] Code:
Solution18.java

- [ ] Time & Space Complexity:
] Time complexity: O(n)
- [ ] Space complexity: O(1)
