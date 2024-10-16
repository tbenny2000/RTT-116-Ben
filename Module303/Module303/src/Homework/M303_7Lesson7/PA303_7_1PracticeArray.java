package Homework.M303_7Lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class PA303_7_1PracticeArray {

    public static void main(String[] args) {

        // Introduction to Array
        // An myArray3 is a simple data structure used to store a collection of data in a
        // contiguous block of memory. Each element in the collection is accessed using an index,
        // and the elements are easy to find because they are stored sequentially in memory.
        //Because the collection of elements in an myArray3 is stored as a big block of data,
        // we typically use arrays when we know exactly how many pieces of data we are going to have.

        // Example 1:
        // Write a program that creates an myArray3 of integers with a length of 3.
        // Assign the values 1, 2, and 3 to the indexes. Print out each myArray3 element.
        int [] num = new int [3];
        for (int pos = 0; pos < num.length; pos++) {
            num[pos] = pos + 1;
            System.out.println("nums[" + pos + "] = " + num[pos]);
        }
        // we can use either "i" or "pos"
        int [] nums = new int [3];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
            System.out.println("nums[" + i + "] = " + nums[i]);
        }
        System.out.println("****************\n");

        // Example 2:
        // Write a program that returns the middle element in an myArray3. Give the following values to
        // the integer myArray3: {13, 5, 7, 68, 2} and produce the following output: 7
        int [] numbers = {13, 5, 7, 68, 2};
        int midIndex = numbers.length / 2;
        System.out.println("The middle element is: " + numbers[midIndex]);
        System.out.println("****************\n");

        // Example 3:
        // Write a program that creates an myArray3 of String type and initializes it with the
        // strings “red,” “green,” “blue,” and “yellow.” Print out the myArray3 length.
        // Make a copy using the clone( ) method. Use the Arrays.toString( )
        // method on the new myArray3 to verify that the original myArray3 was copied.
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        System.out.println("Original myArray3 length: " + colors.length);

        String[] arrCopy = colors.clone();
        System.out.println("Original myArray3 length: " + Arrays.toString(colors));
        System.out.println("Copy myArray3 length:     " + Arrays.toString(arrCopy));
        System.out.println("****************\n");

        // Example 4
        // Write a program that creates an integer myArray3 with 5 elements (i.e., numbers).
        // The numbers can be any integers.  Print out the value at the first index and the
        // last index using length - 1 as the index. Now try printing the value at index = length
        // (e.g., myArray[myArray.length] ).  Notice the type of exception which is produced.
        // Now try to assign a value to the myArray3 index 5. You should get the same type of exception.

        int[] myArray = {5, 10, 15, 20, 25};
        System.out.println("First element (index 0): " + myArray[0]);
        System.out.println("Last element (index length -1): " + myArray[myArray.length - 1]);

        try {
            System.out.println("element at index (out of bounds): " + myArray[myArray.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }

        try {
            myArray[5] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught while assigning to index 5: " + e);
        }
        System.out.println("****************\n");

        // Example 5
        // Write a program where you create an integer myArray3 with a length of 5.
        // Loop through the myArray3 and assign the value of the loop control
        // variable (e.g., i) to the corresponding index in the myArray3.
        int[] myArray2 = new int[5];
        for (int i = 0; i < myArray2.length; i++) {
            myArray2[i] = i + 1;
        }
        System.out.println("Array values after assignment: ");
        for (int i = 0; i < myArray2.length; i++) {
            System.out.println("Element at index: " + i + ": " + myArray2[i]);
        }
        System.out.println("****************\n");

        // Example 6
        // Write a program where you create an integer myArray3 of 5 numbers.
        // Loop through the myArray3 and assign the value of the loop control
        // variable multiplied by 2 to the corresponding index in the myArray3.
        int[] myArray3 = new int[5];
        for (int i = 0; i < myArray3.length; i++) {
            myArray3[i] = i * 2;
        }
        System.out.println("Array values after assignment: ");
        for (int i = 0; i < myArray3.length; i++) {
            System.out.println("Element at index: " + i + ": " + myArray3[i]);
        }
        System.out.println("****************\n");

        // Example 7
        // Write a program where you create an myArray3 of 5 elements.
        // Loop through the myArray3 and print the value of each element, except for the middle (index 2) element.
        int[] myArray4 = {2, 4, 6, 7, 8, 10};
        for (int i = 0; i < myArray4.length; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("Element at index: " + i + ": " + myArray4[i]);
        }
        System.out.println("****************\n");


        // Example 8
        // Write a program that creates a String myArray3 of 5 elements and swaps
        // the first element with the middle element without creating a new myArray3.
        String[] myArray5 = {"Apple", "Banana", "Orange", "Pear", "Elderberry"};
        System.out.println("Original array:");
        for (String element : myArray5) {
            System.out.println(element);
        }
        String temp = myArray5[0];
        myArray5[0] = myArray5[2];
        myArray5[2] = temp;

        System.out.println("\nArray after swapping first and middle element: ");
        for (String element : myArray5) {
            System.out.println(element);
        }
        System.out.println("****************\n");

        // Example 9
        // Write a program to sort the following int array in ascending
        // order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order,
        // and print the smallest and the largest element of the array. The output will look like the following:
        // Array in ascending order: 0, 1, 2, 4, 9, 13
        // The smallest number is 0
        // The biggest number is 13
        int[] myArray6 = {4, 2, 9, 13, 1, 0};
        Arrays.sort(myArray6);
        System.out.println("Array in ascending order: ");
        for (int i = 0; i < myArray6.length; i++) {
            System.out.println(myArray6[i]);
            if (i < myArray6.length - 1) {
                System.out.println(", ");
            }
        }
        System.out.println();
        System.out.println("The smallest number is " + myArray6[0]);
        System.out.println("The largest number is " + myArray6[myArray6.length - 1]);
        System.out.println("****************\n");

        // Example 10
        // Create an array that includes an integer, 3 strings, and 1 double. Print the array.
        Object[] myArray7 = {12, "Banana", "Orange", "Java", 3.14};
        System.out.println("Array elements:");
        for (Object element : myArray7) {
            System.out.println(element);
        }
        System.out.println("****************\n");

        // Example 11
        // Write some Java code that asks the user how many favorite things they have.
        // Based on their answer, you should create a String array of the correct size.
        // Then ask the user to enter the things and store them in the array you created.
        // Finally, print out the contents of the array.
        // For Example: How many favorite things do you have? 7
        //Enter your thing: phone
        //Enter your thing: tv
        //Enter your thing: xbox
        //Enter your thing: wine
        //Enter your thing: beer
        //Enter your thing: sofa
        //Enter your thing: book
        //Your favorite  things are:
        //phone tv xbox wine beer sofa book
        Scanner sc = new Scanner(System.in);
        System.out.println("How many favorite things do you have?");
        int numberOfThings = sc.nextInt();
        sc.nextLine();
        String[] favoriteThings = new String[numberOfThings];
        for (int i = 0; i < numberOfThings; i++) {
            System.out.println("Enter your thing: ");
            favoriteThings[i] = sc.nextLine();
        }
        System.out.println("Your favorite things are: ");
        for (String thing : favoriteThings) {
            System.out.println(thing + " ");
        }
        System.out.println("****************\n");
    }
}
