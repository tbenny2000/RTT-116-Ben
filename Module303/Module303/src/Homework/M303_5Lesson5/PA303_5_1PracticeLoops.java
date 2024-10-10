package Homework.M303_5Lesson5;

import java.util.Scanner;

public class PA303_5_1PracticeLoops {
    public static void main(String[] args) {

        // Example 1 Print a Multiplication Table
        // Write a program that uses nested for loops to print a multiplication table of 12 x 12.
        for (int i =1; i <=12; i++) {
            for (int j = 1; j <=12; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
        System.out.println("****************\n");

        // Example 2 Find the Greatest Common Divisor
        // Write a program that prompts the user to enter two positive integers, and find their greatest common divisor (GCD).
        // Examples:
        // Enter 2 and 4. The gcd is 2.
        // Enter 16 and 24.  The gcd is 8.
        // How do you find the gcd?
        // Name the two input integers n1 and n2.
        // You know number 1 is a common divisor, but it may not be the gcd.
        // Check whether k (for k = 2, 3, 4, and so on) is a common divisor for n1 and n2, until k is greater than n1 or n2.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number (n1): ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number (n2): ");
        int n2 = sc.nextInt();

        int GCD = 1;
        for (int k = 1; k <= n1 && k <=n2; k++) {
            if ((n1 % k == 0) && (n2 % k == 0)) {
                GCD = k;
            }
        }
        System.out.println("The GCD is: " + GCD);
        sc.close();
        System.out.println("****************\n");


        // Example 3 Predict Future Tuition
        // Suppose the tuition for a university is $10,000 for the current year and increases by 7 percent every year.
        //In how many years will the tuition be doubled?
        double tuition = 10000.0;
        double targetTuition = tuition *2;
        double increaseRate = 0.07;
        int years = 0;

        while (tuition < targetTuition) {
            tuition = tuition + (tuition * increaseRate);
            years++;
        }
        System.out.println("Tuition will double in : " + years + " years");
        System.out.println("****************\n");
    }
}
