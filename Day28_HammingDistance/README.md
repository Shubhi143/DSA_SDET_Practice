# Day28 HammingDistance

- [ ] Problem link: https://leetcode.com/problems/hamming-distance/description/
- [ ] Problem description: The Hamming distance between two integers is the number of positions at which
the corresponding bits are different.
- [ ] Example 1:
- Input: x = 1, y = 4
- Output: 2
- Explanation: The binary representation of x is 1 and y is 4 (or 100
in binary). So the Hamming distance is 2.

- [ ] Approach:
- The idea is to convert the numbers to binary and then count the number of different bits.
- We can use bitwise XOR to find the different bits and then count the number of 1's
in the result.
- The XOR operation will set the bits to 1 where the two numbers are different.
- Then we can count the number of 1's in the result by using the count set bits
function.
- The count set bits function will return the number of 1's in the binary representation
of the number.
- We can use the bitwise AND operation with 1 to check if a bit is 1 or
0.
- If the result of the bitwise AND operation is 1, then the bit is 1.
- Otherwise, the bit is 0.

- [ ] Code:
Solution28.java

- [ ] Time & Space Complexity:
- Time complexity: O(log n)
- Space complexity: O(1)

