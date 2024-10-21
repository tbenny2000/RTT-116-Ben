package Homework.M303_11Lesson11.GLAB303_11_6HashMapAndTreeMap;

import java.util.Comparator;

public class CustomComparator implements Comparator<String > {

    // Example Three: TreeMap Comparator.
    // TreeMap elements are sorted in ascending order. However, we can also customize the ordering of keys.
    // For this, we need to create our comparator class based on which keys in a TreeMap are sorted.
    // Create a new Class named “CustomComparator,” and then write the below code in the class.

    @Override
    public int compare(String number1, String number2) {
        int value =  number1.compareTo(number2);

        // elements are sorted in reverse order
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
