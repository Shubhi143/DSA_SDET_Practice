# Day19 ValidParentheses

- [ ] Problem link: 
https://leetcode.com/problems/valid-parentheses/description/
- [ ] Description:
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determin
e if the input string is valid.
An input string is valid if:
- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket must correspond to an open bracket.
- There are no redundant brackets.
- [ ] Example 1:
Input: s = "()"
Output: true
- [ ] Example 2:
Input: s = "()[]{}"
Output: true
- [ ] Example 3:
Input: s = "(]"
Output: false

- [ ] Approach:
use a stack to store the opening bracket and compare 
- [ ] Code:
Solution19.java

- [ ] Time & Space Complexity:
Time complexity: O(n)
Space complexity: O(n)

