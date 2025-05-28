package Day16_GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution16 {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println("Grouped anagrams: " + result);
        }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray); // Sort the characters in the string
            String sortedStr = new String(charArray); // Create a new string from the sorted characters

            // Add the original string to the list corresponding to the sorted string
            anagramMap.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(anagramMap.values()); // Return the grouped anagrams as a list of lists
    }
}
