package Homework.M303_10Lesson10.PA303_10_3PolyAndInterface;

public class LibrayTest {
    public static void main(String[] args) {
        // Test case #1: KidUser
        System.out.println("Test Case #1: Kid User");

        // Create an instance of KidUser with age 10
        KidUser kidUser1 = new KidUser(10);
        kidUser1.registerAccount(); // Register the account
        kidUser1.setBookType("Kids"); // Set book type
        kidUser1.requestBook(); // Request a book

        // Create an instance of KidUser with age 18
        KidUser kidUser2 = new KidUser(18);
        kidUser2.registerAccount(); // Register the account
        kidUser2.setBookType("Fiction"); // Set book type
        kidUser2.requestBook(); // Request a book

        // Test case #2: AdultUser
        System.out.println("\nTest Case #2: Adult User");

        // Create an instance of AdultUser with age 5
        AdultUser adultUser1 = new AdultUser(5);
        adultUser1.registerAccount(); // Register the account
        adultUser1.setBookType("Kids"); // Set book type
        adultUser1.requestBook(); // Request a book

        // Create an instance of AdultUser with age 23
        AdultUser adultUser2 = new AdultUser(23);
        adultUser2.registerAccount(); // Register the account
        adultUser2.setBookType("Fiction"); // Set book type
        adultUser2.requestBook(); // Request a book
    }
}
