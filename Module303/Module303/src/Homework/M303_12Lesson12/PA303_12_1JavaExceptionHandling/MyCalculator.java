package Homework.M303_12Lesson12.PA303_12_1JavaExceptionHandling;

public class MyCalculator {

    // You are required to compute the power of a number by implementing a calculator. Create a class MyCalculator
    // which consists of a single method long power(int, int). This method takes two integers, n and p, as parameters
    // and finds n^p. If either n or p is negative, then the method must throw an exception which says "n or p should
    // not be negative". Also, if both n and p are zero, then the method must throw an exception which says "n and p
    // should not be zero." For example, -4 and -5 would result in  java.lang.Exception: n or p should not be negative.
    // Complete the function power in class MyCalculator and return the appropriate result after the power operation or an appropriate exception as detailed above.
    // Input Format
    // Each line of the input contains two integers, n and p. The locked stub code in the editor reads the input and sends the values to the method as parameters.
    // Method to compute power
    // Method to compute power
    public long power(int n, int p) throws Exception {
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }
        // Calculate power and return result
        return (long) Math.pow(n, p);
    }
}
