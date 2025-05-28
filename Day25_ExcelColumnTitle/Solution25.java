package Day25_ExcelColumnTitle;

public class Solution25 {
    public static void main(String[] args) {
        int columnNumber = 28; // Example input
        String result = convertToTitle(columnNumber);
        System.out.println("Column number " + columnNumber + " corresponds to title: " + result);
        }
    public static String convertToTitle(int columnNumber) {
        StringBuilder columnTitle = new StringBuilder();
        
        while (columnNumber > 0) {
            // Adjust for 1-based indexing
            columnNumber--;
            // Get the current character
            char currentChar = (char) ('A' + (columnNumber % 26));
            // Append to the result
            columnTitle.append(currentChar);
            // Move to the next "digit"
            columnNumber /= 26;
        }
        
        // Since we built the title backwards, reverse it before returning
        return columnTitle.reverse().toString();
    }
}
