# Day17 IntersectionTwoArrays

- [ ] Problem link: 
https://leetcode.com/problems/intersection-of-two-arrays/description/
- [ ] Description:
Given two arrays, write a function to compute their intersection.
- [ ] Example:
Given `1, 2, 2, 1` and `2, 2`,
return `[2]`.
- [ ] Note:
Each element in the result must be distinct.


- [ ] Approach:
1. Convert the first array to a set for O(1) lookup time.
2. Iterate over the second array and check if each element exists in the set.
3. If an element exists, add it to the result set.
4. Return the result set as an array.

- [ ] Code:
Solution17.java

- [ ] Time & Space Complexity:
Time complexity: O(n), where n is the length of the second array.
Space complexity: O(n), where n is the length of the second array.

