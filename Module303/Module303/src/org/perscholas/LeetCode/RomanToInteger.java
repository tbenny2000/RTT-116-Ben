package org.perscholas.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    // ======= ROMAN TO INTEGER ===========
    // Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
    // Symbol       Value
    // I             1
    // V             5
    // X             10
    // L             50
    // C             100
    // D             500
    // M             1000
    // For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII,
    // which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
    // Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
    // Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
    // The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
    // I can be placed before V (5) and X (10) to make 4 and 9.
    // X can be placed before L (50) and C (100) to make 40 and 90.
    // C can be placed before D (500) and M (1000) to make 400 and 900.
    // Given a roman numeral, convert it to an integer.

    public static void main(String[] args) {
        RomanToInteger rti = new RomanToInteger();
        String roman = "LVIV";
        System.out.println(rti.romanToInt(roman));

    }

    public int romanToInt(String s) {
        // Map each Roman numeral to its integer value
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        // Variable to hold the total integer value
        int total = 0;
        // Loop through the string character by character
        for (int i = 0; i < s.length(); i++) {
            int currentValue = romanMap.get(s.charAt(i));
            // Check is the next symbol exists and is greater than the current symbol
            if ((i < s.length() - 1) && (currentValue < romanMap.get(s.charAt(i + 1)))) {
                // Subtract the current value if the next value is greater
                total -= currentValue;
            } else {
                // Add the current value otherwise
                total += currentValue;
            }
        }
        return total;
    }
}
