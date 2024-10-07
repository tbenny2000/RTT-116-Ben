package M303_4;

import java.util.Scanner;

public class IfStatementsExample {
    public static void main(String[] args) {
        double radius = 30;

        if (radius < 10) {
            System.out.println("Radius is greater than 20");
        } else if (radius > 20) {
            System.out.println("Radius is greater than 10");
        } else {
            System.out.println("Radius less than or equal to 10");
        }
        System.out.println("Done");

        // === boolean
        // if the boolean is set to true...the if not specified if statement will always be checking if true
        boolean save = true;
        if (save) {
            // the same as saying if ( save == true) {
            // this will execute when the boolean is true
            if (!save) {
                // the same as saying if ( save == false) {
            }

            // compound conditionals
            // short circuiting means... in this case if save is false the JVM will not even evaluate the radius
            if (save && (radius == 50)) {
                // both conditions are true
            } else {
                // one condition or the other is false or both are false
            }

            // this too will short circuit
            if (save || (radius == 50)) {
                // if either condition (or both) are true than execute here
            } else {
                //
            }
        }

        int grade = 85;
        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        // case statement / switch statement
        switch (grade) {
            case 90:
                System.out.println("A");
                break;
            case 80:
                System.out.println("B");
                break;
            case 70:
                System.out.println("C");
                break;
            case 60:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }

    }
}
