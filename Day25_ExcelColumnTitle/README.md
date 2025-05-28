# Day25 ExcelColumnTitle

- [ ] Problem link: https://leetcode.com/problems/excel-sheet-column-title/description/
- [ ] Difficulty: Easy
- [ ] Language: Java
Description: Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
Input: columnNumber = 1
Output: "A"

- [ ] Approach:
- Convert the integer to a string
- Iterate over the string from right to left
- For each character, convert it to its corresponding character in the Excel column title
- Return the result

- [ ] Code:
Solution25.java

- [ ] Time & Space Complexity:
- Time complexity: O(n), where n is the number of digits in the column number
- Space complexity: O(n), where n is the number of digits in the column number

