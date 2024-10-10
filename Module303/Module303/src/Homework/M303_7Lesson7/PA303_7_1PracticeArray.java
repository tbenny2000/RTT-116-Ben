package Homework.M303_7Lesson7;

import java.lang.reflect.Array;

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
        int [] num = new int [3];
        for (int pos = 0; pos < num.length; pos++) {
            num[pos] = pos + 1;
            System.out.println("num[" + pos + "] = " + num[pos]);
        }
        System.out.println("****************\n");

        // Example 2:
        // Write a program that returns the middle element in an array. Give the following values to
        // the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
        int [] numbers = {13, 5, 7, 68, 2};
        for (int i =0; i < numbers.length; i++) {
            System.out.println("Middle element " + numbers[i]);
        }
        System.out.println("****************\n");

        // find the middle index of 3
        //System.out.println("Index position of 5 is: " + findIndex(my_array, 5));
    }
}
