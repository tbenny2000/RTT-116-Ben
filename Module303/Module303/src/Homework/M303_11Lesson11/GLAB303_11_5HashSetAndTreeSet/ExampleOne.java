package Homework.M303_11Lesson11.GLAB303_11_5HashSetAndTreeSet;

import java.util.HashSet;

public class ExampleOne {

    // Example One: Insert Elements to HashSet using addAll().
    //addAll() - Inserts all of the elements of the specified collection to the set.
    //Create a new Java project and create a new Class named “exampleOne.” Write the code below in the class.
    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();
        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();
        // Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);
    }
}
