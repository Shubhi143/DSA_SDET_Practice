# Day30 PalindromeNumber

- [ ] Problem link: 
https://leetcode.com/problems/palindrome-number/

- [ ] Problem description:
Determine whether an integer is a palindrome. Do this without converting the integer into a string.

- [ ] Approach:
To solve this problem, we can use a two-pointer technique. We will compare the first and last
digits of the number, then move the pointers towards the center of the number. If we find any

pair of digits that are not equal, we can immediately return False. If we successfully compare
all pairs of digits without finding any mismatches, we can return True.

- [ ] Code:
Solution30.java

- [ ] Time & Space Complexity:
Time complexity: O(log n)
Space complexity: O(1)

