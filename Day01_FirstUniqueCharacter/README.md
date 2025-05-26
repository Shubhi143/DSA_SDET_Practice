# Day01 FirstUniqueCharacter

- [ ] Problem link: https://leetcode.com/problems/first-unique-character-in-a-string/description/
- [ ] Approach: Use a frequency array, store the characters of string to the array and then check if the character's count is 1 return the no. of unique characters
- [ ] Code:

class Solution{
public static  int uniqueCharacters(String str){


    int[] frequency=new int[26];
    char[] ch=str.toCharaArray();
    for(int i=0;i<ch.lengthi++){
        frequency[ch[i]-'a']++;
    }
    for(int i=0;i<s.length();i++){
        if(frequency[s.charAt(i)]-'a')==1;
        return i;
    }
    return -1;
}

public static void main(String[] args){
    System.out.println(uniqueCharacters("loveleetcode"));
}
}
- [ ] Time & Space Complexity:
