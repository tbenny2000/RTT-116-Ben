package org.perscholas;

import java.util.Scanner;

public class ScannerExamples {

    public static void main(String[] args) {

        System.out.println("Enter the radius of the circle ");

        Scanner scanner = new Scanner(System.in);

        // after scanning an number we need to do a scanner.nextLine(); to throw
        // the new line character (which was created when you pressed enter on the kyeboard)
        // into the garbage
        // IMPORTANT
        double x = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("You have entered a radius of " + x);

        double area = x * x * 3.14159;

        System.out.println("The area of the circle is " + area);

        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println(name);

    }
}
