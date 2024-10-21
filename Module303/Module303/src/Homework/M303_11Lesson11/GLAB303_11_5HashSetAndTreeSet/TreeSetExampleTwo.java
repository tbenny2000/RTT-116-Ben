package Homework.M303_11Lesson11.GLAB303_11_5HashSetAndTreeSet;

import java.util.TreeSet;

public class TreeSetExampleTwo {

    // Example two: Remove Elements
    //remove() - removes the specified element from the set.
    //removeAll() - removes all of the elements from the set.
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using the remove() method
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);

        // Using the removeAll() method
        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);
    }
}
