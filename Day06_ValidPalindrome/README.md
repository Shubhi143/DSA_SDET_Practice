# Day06 ValidPalindrome

- [ ] Problem link: 
https://leetcode.com/problems/valid-palindrome/description/
- [ ] Approach:
- The problem asks to determine if a given string is a valid palindrome. A palindrome is a
string that reads the same backward as forward.
- We can solve this problem by comparing characters from the start and end of the string
and moving towards the center. If we find any pair of characters that are not equal, we
return False. If we successfully compare all pairs of characters, we return True.

- [ ] Code:

Solution6.java

- [ ] Time & Space Complexity:
- Time complexity: O(n), where n is the length of the string. We are iterating over
the string once.
- Space complexity: O(1), as we are not using any additional space that scales with
the input size.
