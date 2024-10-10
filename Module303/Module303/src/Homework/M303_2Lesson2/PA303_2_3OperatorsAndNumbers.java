package Homework.M303_2Lesson2;

public class PA303_2_3OperatorsAndNumbers {
    public static void main(String[] args) {

        // EXAMPLE 1
        // Write a program that declares an integer a variable x, assigns the value 2 to it,
        // and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
        // Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
        // Before printing the results, write a comment with the predicted decimal value and binary string.
        // Now, print out x in decimal form and in binary notation.

        int x = 2;
        System.out.println("Starting value of x: " + x);
        System.out.println("Binary string version: " + Integer.toBinaryString(x));

        // After shifting 1 to the left (<< 1)
        x = x << 1;
        System.out.println("Decimal value of x after shifting <<1: " + x);
        System.out.println("Binary string version: " + Integer.toBinaryString(x));
        System.out.println("*********************************\n");


        // EXAMPLE 2
        // Write a program that declares a variable x, and assigns 150 to it, and prints out
        // the binary string version of the number. Now use the right shift operator (>>) to shift
        // by 2 and assign the result to x. Write a comment indicating what you anticipate
        // the decimal and binary values to be. Now print the value of x and the binary string.

        int y = 150;
        System.out.println("Starting value of y: " + y);
        System.out.println("Binary string version: " + Integer.toBinaryString(y));

        // After shifting 2 to the right (>> 2)
        y = y >> 2;
        System.out.println("Decimal value of y after shifting >> 2: " + y);
        System.out.println("Binary string version: " + Integer.toBinaryString(y));
        System.out.println("*********************************\n");

        // EXAMPLE 3
        // Write a program that declares three int variables: x, y, and z.
        // Assign 7 to x and 17 to y. Write a comment that indicates what you predict
        // will be the result of the bitwise and operation on x and y.
        // Now use the bitwise AND (&) operator to derive the decimal and binary values, and assign the result to z.
        int b = 7;
        int c = 17;
        int r = b & c;
        System.out.println("The result of b & c in decimal is: " + r);
        System.out.println("The result of b & c in binary is: " + Integer.toBinaryString(r));
        System.out.println("*********************************\n");

        // EXAMPLE 4
        // Now, with the preceding values, use the bitwise and operator to calculate the “or” value between p and o.
        // As before, write a comment that indicates what you predict the values to be before printing them out
        int p = b;
        int o = c;
        int orResult = p | o;
        System.out.println("The result of p | c (or) in decimal is: " + orResult);
        System.out.println("The result of p | c (or) in binary is: " + Integer.toBinaryString(orResult));
        System.out.println("*********************************\n");

        // EXAMPLE 5
        // Write a program that declares an integer variable, assigns a number, and uses a postfix increment
        // operator to increase the value. Print the value before and after the increment operator.
        int number = 5;
        System.out.println("Before increment; " + number);
        int newNumber = number++;
        System.out.println("Value use for newNumber: " + newNumber);
        System.out.println("After increment; " + number);
        System.out.println("*********************************\n");


        // EXAMPLE 6
        // Write a program that demonstrates at least three ways to increment a variable by 1 and does this
        // multiple times. Assign a value to an integer variable, print it, increment by 1, print it again,
        // increment by 1, and then print it again.
        int num = 5;
        System.out.println("Initial Value: " + num);

        ++num;
        System.out.println("After pre-increment (++num); " + num);

        num++;
        System.out.println("After post-increment (num++); " + num);

        num += 1;
        System.out.println("After increment (num += 1); " + num);
        System.out.println("*********************************\n");


        // EXAMPLE 7
        // Write a program that declares two integer variables: x, and y, and then assigns 5 to d and 8 to e.
        // Create another variable sum and assign the value of ++d added to e, and print the result.
        // Notice the value of the sum (should be 14). Now change the increment operator to postfix (d++)
        // and re-run the program. Notice what the value of the sum is. The first configuration incremented d,
        // and then calculated the sum, while the second configuration calculated the sum, and then incremented d.
        int d = 5;
        int e = 8;

        // Using pre-increment
        int sum1 = ++d + e;
        System.out.println("Using pre-increment (++d):");
        System.out.println("Value of d: " + d); // d is now 6
        System.out.println("Value of e: " + e);
        System.out.println("Sum (++d + e): " + sum1); // sum should be 14

        // Reset d to 5 for the next demonstration
        d = 5;

        // Using post-increment
        int sum2 = d++ + e; // Add d to e before incrementing d
        System.out.println("\nUsing post-increment (d++):");
        System.out.println("Value of d after calculation: " + d); // d is now 6 after increment
        System.out.println("Value of e: " + e);
        System.out.println("Sum (d++ + e): " + sum2); // sum should be 13
        System.out.println("****************\n");

    }
}
