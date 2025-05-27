package Day04_ReverseWordsInString;

public class Solution4 {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String result = reverseWords(s);
                System.out.println("Reversed words: \"" + result + "\"");
            }
        
            private static String reverseWords(String s) {
                // TODO Auto-generated method stub
                if (s == null || s.isEmpty()) {
                    return s;
                }
                String[] arr=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
            sb.append(" ");
        }
        return sb.toString().trim();

                }
            }

