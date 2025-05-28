package Day23_RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution23 {
    public static void main(String[] args) {
        String s = "MCMXCIV"; // Example input
        int result = romanToInt(s);
        System.out.println("The integer value of the Roman numeral " + s + " is: " + result);
        }
    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
    romanMap.put('I', 1);
    romanMap.put('V', 5);
    romanMap.put('X', 10);
    romanMap.put('L', 50);
    romanMap.put('C', 100);
    romanMap.put('D', 500);
    romanMap.put('M', 1000);

    int total = 0;
    int prevValue = 0;

    for (int i = s.length() - 1; i >= 0; i--) {
        int value = romanMap.get(s.charAt(i));
        if (value < prevValue) {
            total -= value;
        } else {
            total += value;
        }
        prevValue = value;
    }
    return total;

        
    }
    }

