package Homework.M303_2_2;

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

        // EXAMPLE 3
        // Write a program that declares three int variables: x, y, and z.
        // Assign 7 to x and 17 to y. Write a comment that indicates what you predict
        // will be the result of the bitwise and operation on x and y.
        // Now use the bitwise AND (&) operator to derive the decimal and binary values, and assign the result to z.

        // EXAMPLE 4
        // Now, with the preceding values, use the bitwise and operator to calculate the “or” value between x and y.
        // As before, write a comment that indicates what you predict the values to be before printing them out

        // EXAMPLE 5
        // Write a program that declares an integer variable, assigns a number, and uses a postfix increment
        // operator to increase the value. Print the value before and after the increment operator.



        // EXAMPLE 6
        // Write a program that demonstrates at least three ways to increment a variable by 1 and does this
        // multiple times. Assign a value to an integer variable, print it, increment by 1, print it again,
        // increment by 1, and then print it again.
        int b = 2;
        b++;

        System.out.println(b);

        // EXAMPLE 7
        // Write a program that declares two integer variables: x, and y, and then assigns 5 to x and 8 to y.
        // Create another variable sum and assign the value of ++x added to y, and print the result.
        // Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++)
        // and re-run the program. Notice what the value of the sum is. The first configuration incremented x,
        // and then calculated the sum, while the second configuration calculated the sum, and then incremented x.

    }
}
