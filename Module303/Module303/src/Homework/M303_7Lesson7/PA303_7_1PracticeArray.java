package Homework.M303_7Lesson7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PA303_7_1PracticeArray {

    public static void main(String[] args) {

        // Introduction to Array
        // An array is a simple data structure used to store a collection of data in a
        // contiguous block of memory. Each element in the collection is accessed using an index,
        // and the elements are easy to find because they are stored sequentially in memory.
        //Because the collection of elements in an array is stored as a big block of data,
        // we typically use arrays when we know exactly how many pieces of data we are going to have.

        // Example 1:
        // Write a program that creates an array of integers with a length of 3.
        // Assign the values 1, 2, and 3 to the indexes. Print out each array element.
//        int [] num = new int [3];
//        for (int pos = 0; pos < num.length; pos++) {
//            num[pos] = pos + 1;
//            System.out.println("num[" + pos + "] = " + num[pos]);
//        }
        // we can use either "i" or "pos"
        int [] num = new int [3];
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
            System.out.println("num[" + i + "] = " + num[i]);
        }
        System.out.println("****************\n");

        // Example 2:
        // Write a program that returns the middle element in an array. Give the following values to
        // the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
        int [] numbers = {13, 5, 7, 68, 2};
        int midIndex = numbers.length / 2;
        System.out.println("The middle element is: " + numbers[midIndex]);
        System.out.println("****************\n");

        // Example 3:
        // Write a program that creates an array of String type and initializes it with the
        // strings “red,” “green,” “blue,” and “yellow.” Print out the array length.
        // Make a copy using the clone( ) method. Use the Arrays.toString( )
        // method on the new array to verify that the original array was copied.
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        System.out.println("Original array length: " + colors.length);

        String[] arrCopy = colors.clone();
        System.out.println("Original array length: " + Arrays.toString(colors));
        System.out.println("Copy array length:     " + Arrays.toString(arrCopy));
        System.out.println("****************\n");

        // Example 4
        // Write a program that creates an integer array with 5 elements (i.e., numbers).
        // The numbers can be any integers.  Print out the value at the first index and the
        // last index using length - 1 as the index. Now try printing the value at index = length
        // (e.g., myArray[myArray.length] ).  Notice the type of exception which is produced.
        // Now try to assign a value to the array index 5. You should get the same type of exception.


    }
}
