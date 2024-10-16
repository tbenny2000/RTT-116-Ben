package org.perscholas.LeetCode;

import java.util.Arrays;

public class LongestCommonPrefix {
    // ===== LONGEST COMMON PREFIX ======
    // Write a function to find the longest common prefix string amongst an array of strings.
    // If there is no common prefix, return an empty string "".
    // Example 1:
    // Input: strs = ["flower","flow","flight"]
    // Output: "fl"

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] strs = {"flower", "flow" , "flight"}; // test case
        System.out.println(lcp.longestCommonPrefix(strs)); // output: "fl"
    }


    public String longestCommonPrefix(String[] strs) {
        // Step 1 - Edge case - if the array is empty, return an empty string
        if ((strs == null) || (strs.length == 0)) {
            return "";
        }

        // Step 2 - take the first string as the reference for comparison
        String prefix = strs[0];

        // Step 3 - Loop through the rest of the the strings
        for (int i =1; i < strs.length; i++) {
            // Step 4 - update the prefix by checking against each string
            while (strs[i].indexOf(prefix) !=0) {
                // Reduce the prefix by removing the last character
                prefix = prefix.substring(0, prefix.length() -1);

                // If the prefix becomes empty, returns an empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        // Step 5 - Return the longest common prefix
        return prefix;
    }

}
