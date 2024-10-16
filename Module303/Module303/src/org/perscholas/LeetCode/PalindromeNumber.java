package org.perscholas.LeetCode;

public class PalindromeNumber {
    public static void main(String[] args) {
        // =========== PALINDROME NUMBER ==========
        // Given an integer x, return true if x is a palindrome, and false otherwise.
        // Example 1:
        // Input: x = 121
        // Output: true
        // Explanation: 121 reads as 121 from left to right and from right to left.

        PalindromeNumber p = new PalindromeNumber();
        int x =10;
        System.out.println(p.isPalindrome(x)); // Output: true
    }
    public boolean isPalindrome(int x) {
        // Step 1 - Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }
        // Step 2 - Numbers ending in 0 are not palindromes unless the is 0
        if ((x != 0) && (x % 10 == 0)) {
            return false;
        }
        // Step 3 - Reverse half of the number and compare it
        int reverseHalf = 0;
        while (x > reverseHalf) {
            // Extractthe last digit and add it to the reveresed half
            reverseHalf = reverseHalf * 10 + x % 10;
            // Remove the last digit from x
            x = x / 10;
        }
        // Step 4 - Check if the original number equals the reversed half or if it's a palindrome for an odd length number
        return x == reverseHalf || x == reverseHalf / 10;
    }
}
