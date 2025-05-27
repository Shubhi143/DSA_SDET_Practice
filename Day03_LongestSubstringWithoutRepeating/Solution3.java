package Day03_LongestSubstringWithoutRepeating;

public class Solution3 {
    public static int longestSubstringWithoutRepeat(String s){
        if(s == null || s.length() == 0) return 0;
        int[] frequency = new int[256]; // ASCII character set
        int left = 0, right = 0, maxLength = 0;
        while(right < s.length()){
            char currentChar = s.charAt(right);
            frequency[currentChar]++;
            while(frequency[currentChar] > 1){
                frequency[s.charAt(left)]--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
           

    }


    public static void main(String[] args) {
        String s = "abcabcbb";
      int result = longestSubstringWithoutRepeat(s);
        System.out.println("Longest substring without repeating characters in \"" + s + "\": " + result);
    }
}
