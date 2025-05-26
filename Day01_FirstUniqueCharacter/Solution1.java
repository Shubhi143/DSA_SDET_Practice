
class Solution1{
    public static  int uniqueCharacters(String str){
    
    
        int[] frequency=new int[26];
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            frequency[ch[i]-'a']++;
        }
        for(int i=0;i<str.length();i++){
            if(frequency[str.charAt(i)-'a']==1)
            return i;
        }
        return -1;
    }
    
    public static void main(String[] args){
        System.out.println(uniqueCharacters("loveleetcode"));
        System.out.println(uniqueCharacters("leetcode"));
        
    }
    }