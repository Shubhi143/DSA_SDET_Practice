# Day16 GroupAnagrams

- [ ] Problem link: 
https://leetcode.com/problems/group-anagrams/description/
- [ ] Problem description:
Given an array of strings `strs` where `strs[i]` and `strs
[j]` belong to two different subsets, determine if there exists a subset `s` of
`strs` such that the intersection of every string in `s` is not empty (i
.e., `set(strs[i]) & set(strs[j]) != set()` for every pair
of `strs[i]` and `strs[j]` in `s`). In other
words, s is a string that contains all the strings in `s` as substrings.
The return value should be a list of lists of strings, where each list of strings
represents one subset.

- [ ] Approach:
1.  Create a hashmap to store the sorted characters of each string as the key and the corresponding
strings as the value.
2.  Iterate over the input array and for each string, sort its characters and use it as
the key to store the string in the hashmap.
3.  If the hashmap already contains the key, append the string to the corresponding list in th
e hashmap.
4.  If the hashmap does not contain the key, add a new key-value pair to th
e hashmap.
5.  Finally, return the values of the hashmap as the result.


- [ ] Code:
Solution16.java

- [ ] Time & Space Complexity:
Time complexity: O(NMlogM), where N is the number of strings and M is th
e maximum length of a string. This is because we are sorting the characters of each string.
Space complexity: O(NM), where N is the number of strings and M is th
e maximum length of a string. This is because we are storing the sorted characters of each string in
the hashmap.

