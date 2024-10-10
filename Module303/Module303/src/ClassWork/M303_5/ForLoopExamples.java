package ClassWork.M303_5;

import java.util.ArrayList;
import java.util.List;

public class ForLoopExamples {
    public static void main(String[] args) {

        // this is the original 1970's for loop and it works great for when you want to count
        // or do something a set number of times.
        // this is also good for positioning within an array or string

        // counting up
        for (int count = 0; count < 10; count++) {
            System.out.println("For loop iterations " + count);
        }

        // count down
        for (int count = 10; count >= 1; count--) {
            System.out.println("For loop iterations " + count);
        }

        // the array is o based...so that means the positions in the array are from 0 to 4
        String [] strings = {"one" , "two" , "three" , "four" , "five" , "six"};

        // old style loop
        for (int pos = 0; pos < strings.length; pos++) {
            String value = strings[pos];
            System.out.println("strings at position " + pos + "=" + value);
        }

        // new style for loop for array
        for ( String string : strings) {
            System.out.println("new style for loop for an array: " + string);
        }

        // looping over the characters in a string
        //                   0123456
        String characters = "abcdefg";
        for (int pos = 0; pos < characters.length(); pos++) {
            System.out.println("character at position " + pos + "=" + characters.charAt(pos));
        }

        // looping over a list
        List<String> stringList = new ArrayList<>();
        stringList.add("one"); // pos 0
        stringList.add("two"); // pos 1
        stringList.add("three"); // pos 2
        stringList.add("four"); // pos 3
        stringList.add("five"); // pos 4

        // not that the list uses .size() to get the number of element in the list
        for (int pos = 0; pos < stringList.size(); pos++) {
            // we are using the .get function to get a element of the list by its position
            String value = stringList.get(pos);
            System.out.println("strings at position " + pos + "=" + value);
        }

        // new style for loop
        // read this in my mind...for string in stringList
        // this for loop is easier to type an dread bu does not contain the pos in the list that each item came from
        // which is okay in lots of cases
        for (String string : stringList) {
            System.out.println("new for loop " + string);
        }


    }
}
