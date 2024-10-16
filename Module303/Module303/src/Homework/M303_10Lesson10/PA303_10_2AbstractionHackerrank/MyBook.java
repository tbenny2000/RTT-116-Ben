package Homework.M303_10Lesson10.PA303_10_2AbstractionHackerrank;

import java.util.Scanner;

public class MyBook extends Book {

    // Implementing the abstract method
    @Override
    void setTitle(String s) {
        this.title = s; // Set the title
    }
}