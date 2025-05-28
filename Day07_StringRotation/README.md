# Day07 StringRotation

- [ ] Problem link: 
https://leetcode.com/problems/rotate-string/description/
- [ ] Description:
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.
 

Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true

- [ ] Code:
Solution7.java

- [ ] Time & Space Complexity:

Time complexity: O(n)
Space complexity: O(n)
- [ ] Explanation:
The problem can be solved by checking if the string s can be rotated to match the goal string.
We can do this by concatenating the string s with itself and then checking if the goal string is
a substring of the concatenated string. If it is, then the string s can be rotated to match
the goal string.
