package Homework.M303_12Lesson12.PA303_12_1JavaExceptionHandling;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int p = sc.nextInt();

            try {
                // Call the power method and print the result
                System.out.println(myCalculator.power(n, p));
            } catch (Exception e) {
                // Print the exception message
                System.out.println(e);
            }
        }
        sc.close();
    }
}
