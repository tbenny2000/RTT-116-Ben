package Homework.M303_10Lesson10.PA303_10_2AbstractionHackerrank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a book title: ");
        String title = sc.nextLine(); // Read the title from input
        MyBook newNovel = new MyBook(); // Create a MyBook instance
        newNovel.setTitle(title); // Set the title
        System.out.println("The title is: " + newNovel.getTitle()); // Print the title
        sc.close();
    }
}