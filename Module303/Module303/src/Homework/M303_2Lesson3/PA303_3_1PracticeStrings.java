package Homework.M303_2Lesson3;

import java.util.Scanner;

public class PA303_3_1PracticeStrings {
    public static void main(String[] args) {

        // JAVA STRING INTRODUCTION

        // Example strings
        String s1 = "hello";
        String s2 = "java";

        // For the first line, sum the lengths of A and B
        System.out.println(s1.length() + s2.length());

        // For the second line, compare strings lexicographically
        System.out.println(s1.compareTo(s2) > 0 ? "Yes" : "No");

        // For the third line, capitalize the first letter in both A and B
        String cap1 = s1.substring(0, 1).toUpperCase() + s1.substring(1);
        String cap2 = s2.substring(0, 1).toUpperCase() + s2.substring(1);
        System.out.println(cap1 + " " + cap2);
        System.out.println("****************\n");

        // JAVA SUBSTRING
        Scanner scanner = new Scanner(System.in);  // Create only one scanner instance

        // Input string and two space-separated integers
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        System.out.println("Enter start and end indices:");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        // Print the substring from start to end
        System.out.println(inputString.substring(start, end));
        System.out.println("****************\n");

        // JAVA COMPARISONS
        System.out.println("Enter length k for smallest/largest substring:");
        int k = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        // Find and print smallest and largest substrings
        System.out.println(getSmallestAndLargest(inputString, k));
        System.out.println("****************\n");

        // JAVA STRING REVERSE (Palindrome check)
        System.out.println("Enter a string to check for palindrome:");
        String palindromeCheck = scanner.nextLine();

        String reversed = new StringBuilder(palindromeCheck).reverse().toString();
        if (palindromeCheck.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println("****************\n");

        // JAVA STRING TOKENS
        // Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
        // We define a token to be one or more consecutive English alphabetic letters. Then, print the number
        // of tokens, followed by each token on a new line.
        //Note: You may find the String.split method helpful in completing this challenge.
        System.out.println("Enter a string to tokenize:");
        String s = scanner.nextLine().trim();
        if (s.isEmpty()) {
            System.out.println(0);
        } else {
            String[] tokens = s.split("[!,?._'@ ]+");
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }

        scanner.close();  // Close the scanner at the end
        System.out.println("****************\n");
    }

    // Method to find the smallest and largest substrings
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Iterate through the rest of the substrings of length k
        for (int i = 1; i <= s.length() - k; i++) {
            String substr = s.substring(i, i + k);

            // Update smallest and largest
            if (substr.compareTo(smallest) < 0) {
                smallest = substr;
            }
            if (substr.compareTo(largest) > 0) {
                largest = substr;
            }
        }
        return smallest + "\n" + largest;

    }

}

