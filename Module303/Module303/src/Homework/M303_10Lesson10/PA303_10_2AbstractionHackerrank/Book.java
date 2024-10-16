package Homework.M303_10Lesson10.PA303_10_2AbstractionHackerrank;

public abstract class Book {

    String title;

    // Abstract method to set the title
    abstract void setTitle(String s);

    // Method to get the title
    String getTitle() {
        return title;
    }
}
