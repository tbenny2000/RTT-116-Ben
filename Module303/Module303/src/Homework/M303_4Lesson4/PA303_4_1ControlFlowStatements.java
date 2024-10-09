package Homework.M303_4Lesson4;

public class PA303_4_1ControlFlowStatements {
    public static void main(String[] args) {

        // Example 1
        // Write a program that declares 1 integer variable x, and then assigns 7 to it.
        // Write an if statement to print out “Less than 10” if x is less than 10. Change x to equal 15,
        // and notice the result (console should not display anything).
        int x = 15;
        // for (int i = 1; i <= n; ++i) {
        for (int i = 10; i < 10; ++i) {
            System.out.println(x);
        }

        // Example 2
        // Write a program that declares 1 integer variable y, and then assigns 7 to it.
        // Write an if-else statement that prints out “Less than 10” if y is less than 10,
        // and “Greater than 10” if y is greater than 10. Change y to 15 and notice the result.
        int y = 15;
        if (y < 10) {
            System.out.println("Less than 10: " + y);
        } else {
            System.out.println("Greater than 10: " + y);
        }

        // Example 3
        // Write a program that declares 1 integer variable z, and then assigns 15 to it.
        // Write an if-else-if statement that prints out “Less than 10” if z is less than 10;
        // “Between 10 and 20” if z is greater than 10 but less than 20, and “Greater than or
        // equal to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.
        int z = 50;
        if (z < 10) {
            System.out.println("Less than 10: " + z);
        } else if (z > 10 && z < 20) {
            System.out.println("Greater than 10: " + z);
        } else {
            System.out.println("Greater than or equal to 20: " + z);
        }


        // Example 4
        // Write a program that declares 1 integer variable x, and then assigns 15 to it.
        // Write an if-else statement that prints “Out of range” if the number is less than 10 or
        // greater than 20 and prints “In range” if the number is between 10 and 20 (including equal to 10 or 20).
        // Change x to 5 and notice the result.


        // Example 5
        // Write a program that uses if-else-if statements to print out grades A, B, C, D, F, according to the following criteria:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: <60
        //Use the Scanner class to accept a number score from the user to determine the letter grade.
        // Print out “Score out of range” if the score is less than 0 or greater than 100.

        // Example 6
        // Write a program that accepts an integer between 1 and 7 from the user. Use a switch statement to
        // print out the corresponding weekday. Print “Out of range” if the number is less than 1 or greater than 7.
        // Do not forget to include “break” statements in each of your cases.

    }
}
