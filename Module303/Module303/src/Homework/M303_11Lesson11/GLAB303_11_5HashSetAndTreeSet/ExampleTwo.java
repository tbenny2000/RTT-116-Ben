package Homework.M303_11Lesson11.GLAB303_11_5HashSetAndTreeSet;

import java.util.HashSet;

public class ExampleTwo {

    // Example Two: Union of Sets.
    //To perform the union between two sets, we can use the addAll() method.
    //Create a new Class named “exampletwo,” and then write the code below in the class.
    public static void main(String[] args) {

        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("HashSet1: " + evenNumbers);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        System.out.println("HashSet2: " + numbers);

        // Union of two set
        numbers.addAll(evenNumbers);
        System.out.println("Union is: " + numbers);
    }
}
