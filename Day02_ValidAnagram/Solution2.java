public class Solution2 {
    
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean result = isAnagram(s, t);
        System.out.println("Is \"" + s + "\" an anagram of \"" + t + "\": " + result);
    }
    
    public static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()) return false;
        
        int[] frequency=new int[26];
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            frequency[ch-'a']++;
        }
        
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            frequency[ch-'a']--;
        }
        
        for(int i=0;i<26;i++){
            if(frequency[i]!=0){
                return false;
            }
        }
        return true;
    }
}