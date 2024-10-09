package Homework.M303_5Lesson5;

import java.util.Scanner;

public class GLAB303_5_1ForLoop {
    public static void main(String[] args) {

        // Example 1: Display a Text Five Times
        int n = 5;
        // for loop
        for (int i = 1; i <= n; ++i) {
            System.out.println("Java is fun");
        }

        // Example 2: Display Sum of n1 Natural Numbers
        int sum = 0;
        int n1 = 1000;
        // for loop
        for (int i = 1; i <= n1; ++i) {
            // body inside for loop
            sum = sum + i;     // sum = sum + i
        }
        System.out.println("Sum = " + sum);

        // Example 3: Palindrome
        // In this example, we are going to see whether a number is a palindrome.
        // A for loop is used in this case. A palindrome number, when reversed, represents the same number.
        String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse)) {
            System.out.println("Entered string/number is a palindrome.");
        }else
        {
            System.out.println("Entered string/number isn't a palindrome.");
        }

        // Example 4: Pyramid
        // Here, the class name is PyramidExample. The main() is declared. After that, the two loop control
        // variables are declared. One is the loop control variable “i,” and the other is the loop control
        // variable “j.” Then the “*” is printed in the loop control.
        //The new line is given so that the given format of the pyramid structure is maintained.
        // In this code, the program runs five times. However, by increasing the value of the letter “i,”
        // we can make sure that the pyramid is bigger.
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();//new line
        }

        //
    }
}
