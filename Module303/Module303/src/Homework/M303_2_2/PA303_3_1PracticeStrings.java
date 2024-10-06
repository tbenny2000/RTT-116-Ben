package Homework.M303_2_2;

import java.util.Scanner;

public class PA303_3_1PracticeStrings {
    public static void main(String[] args) {

        // JAVA STRING INTRODUCTION

        // There are three lines of output:
        // For the first line, sum the lengths of A and B.
        // For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
        // For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.

        String s1 = "hello";
        String s2 = "java";
        System.out.println(s1.length() + s2.length());
        System.out.println(s1.compareTo(s2) > 0 ? "Yes" : "No");
        String cap1 = s1.substring(0, 1).toUpperCase() + s1.substring(1);
        String cap2 = s2.substring(0, 1).toUpperCase() + s2.substring(1);
        System.out.println(cap1 + " " + cap2);

        // JAVA SUBSTRING
        // The first line contains a single string denoting s.
        //The second line contains two space-separated integers denoting the respective values of start and end.

        String s3 = "Helloworld";
        System.out.println(s3.substring(0,5));

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(s.substring(start, end));


        // JAVA COMPARISONS
        // Given a string, S, and an integer, K, complete the function so that it finds the lexicographically
        // smallest and largest substrings of length K.
        //Function Description
        //Complete the getSmallestAndLargest function in the editor below.
        //getSmallestAndLargest has the following parameters:
        //  string s: a string
        //  int k: the length of the substrings to find
        //  Returns
        //  string: the string ' + "\n" + ' where and are the two substrings
        Scanner scan = new Scanner(System.in);
        //String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));

    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Iterate through the rest of the substrings of length k
        for (int i = 1; i <= s.length() - k; i++) {
            // Get the substring starting at index i
            String substr = s.substring(i, i + k);

            // Update smallest if current substring is smaller
            if (substr.compareTo(smallest) < 0) {
                smallest = substr;
            }

            // Update largest if current substring is larger
            if (substr.compareTo(largest) > 0) {
                largest = substr;
            }
        }

        return smallest + "\n" + largest;
    }

    // JAVA STRING REVERSE
    // A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
    // Given a string A, print Yes if it is a palindrome, print No otherwise.
    // Constraints - A will consist of most 50 lowe case english letters.
    Scanner sc=new Scanner(System.in);
    String s = sc.nextLine();

    String reversed = new StringBuilder(s).reverse().toString();
//        if (s.equals(reversed)) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//        sc.close();

}
