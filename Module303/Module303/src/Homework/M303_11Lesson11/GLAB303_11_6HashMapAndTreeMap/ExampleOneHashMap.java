package Homework.M303_11Lesson11.GLAB303_11_6HashMapAndTreeMap;

import java.util.HashMap;

public class ExampleOneHashMap {

    // Example One: Remove HashMap Elements.
    //To remove elements from a hashmap, we can use the remove() method as shown below.
    //Create a new Java project and create a new Class named “ExampleOneHashMap ,” and then write the code below in the class.
    public static void main(String[] args) {

        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        languages.put(4, "C Sharp");

        System.out.println("HashMap: " + languages);

        // remove element associated with key 2
        String value = languages.remove(2);
        System.out.println("Removed value: " + value);
        System.out.println("Updated HashMap: " + languages);

        // Here, the remove() method takes the key as its parameter. It then returns the value associated with the key and removes the entry.
        //We can also remove the entry only under certain conditions. For example: remove(4, "C Sharp");
        //Here, the remove() method only removes the entry if the key 4 is associated with the value "C Sharp."
    }
}
