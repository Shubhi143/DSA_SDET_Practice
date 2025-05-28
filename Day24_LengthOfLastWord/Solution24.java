package Day24_LengthOfLastWord;

public class Solution24 {
    public static void main(String[] args) {
        String s = "Hello World";
        int result = lengthOfLastWord(s);
        System.out.println("The length of the last word is: " + result);
        }
    public static int lengthOfLastWord(String s) {
        // Trim the string to remove leading and trailing spaces
        String[] str=s.split("\\s+");
        return str[str.length-1].length();
    }
}
