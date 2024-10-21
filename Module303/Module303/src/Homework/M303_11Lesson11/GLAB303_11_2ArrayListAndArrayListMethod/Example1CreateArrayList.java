package Homework.M303_11Lesson11.GLAB303_11_2ArrayListAndArrayListMethod;

import java.util.ArrayList;
import java.util.List;

public class Example1CreateArrayList {
    // Key Points about ArrayList in Java:
    // An ArrayList is a resizable array, also called a dynamic array.
    // It grows its size to accommodate new elements, and shrinks its size when the elements are removed.
    // An ArrayList internally uses an array to store the elements.
    // Just like arrays, it allows you to retrieve the elements by index.
    // A Java ArrayList allows for duplicate and null values.
    // A Java ArrayList is an ordered collection, and maintains the insertion order of the elements.
    // You cannot create an ArrayList of primitive types such as int, char, etc.;
    // you need to use boxed types such as Integer, Character, Boolean, etc.
    // A Java ArrayList is not synchronized. If multiple threads try to modify an ArrayList simultaneously,
    // the final outcome will be non-deterministic. You must explicitly synchronize access to an
    // ArrayList if multiple threads are going to modify it.

    // Example 1 Creating and ArrayList and Adding New Elements
    public static void main(String[] args) {
        // Creating an ArrayList of String
        List<String> animals = new ArrayList<>();

        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        // Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");
        System.out.println(animals);
    }
}
