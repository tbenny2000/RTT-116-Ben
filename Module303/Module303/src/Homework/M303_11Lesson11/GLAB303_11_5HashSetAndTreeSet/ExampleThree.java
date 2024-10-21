package Homework.M303_11Lesson11.GLAB303_11_5HashSetAndTreeSet;

import java.util.HashSet;

public class ExampleThree {

    // Example Three: Difference of Sets.
    //To calculate the difference between the two sets, we can use the removeAll() method:
    //Create a new Class named “examplethree,” and then write the code below in the class.
    public static void main(String[] args) {
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("HashSet2: " + oddNumbers);

        // Difference between HashSet1 and HashSet2
        primeNumbers.removeAll(oddNumbers);
        System.out.println("Difference : " + primeNumbers);
    }
}
