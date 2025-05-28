# Day21 SpiralMatrix

- [ ] Problem link: https://leetcode.com/problems/spiral-matrix/description/
Given an m x n matrix, return all elements of the matrix in spiral order.

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

- [ ] Approach:
- Create a function `spiralOrder` that takes a 2D list `matrix
- Initialize an empty list `result` to store the spiral order of the matrix
- Initialize four pointers: `top`, `bottom`, `left`, `right` to the first
and last elements of the first row and the first and last elements of the
last column
- While the pointers are not equal, perform the following steps:
- Append the top element to the result list
- Move the top pointer down
- If the top pointer is not equal to the bottom pointer, append the right
element to the result list and move the right pointer to the left
- If the right pointer is not equal to the left pointer, append the bottom
element to the result list and move the bottom pointer up
- If the bottom pointer is not equal to the top pointer, append the left
element to the result list and move the left pointer to the right
- Return the result list

- [ ] Code:
Solution21.java

- [ ] Time & Space Complexity:
- Time complexity: O(m*n) where m and n are the number of rows and columns
in the matrix
- Space complexity: O(m*n) for the result list

