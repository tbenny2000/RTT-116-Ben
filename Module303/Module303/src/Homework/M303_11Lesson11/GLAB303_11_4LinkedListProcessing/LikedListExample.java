package Homework.M303_11Lesson11.GLAB303_11_4LinkedListProcessing;

import java.util.Collections;
import java.util.LinkedList;

public class LikedListExample {

    // Example One: LinkedList Methods
    // Create a class named “LinkedListExample” and add the code below:
    public static void main(String args[]) {

        /* Linked List Declaration */
        LinkedList<String> linkedlist = new LinkedList<String>();

        /*add(String Element) is used for adding
         * the elements to the linked list*/
        linkedlist.add("Item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");
        linkedlist.add("Item6");
        linkedlist.add("Item2");

        /*Display Linked List Content*/
        System.out.println("Linked List Content: " +linkedlist);

        /*Add First and Last Element*/
        linkedlist.addFirst("First Item");
        linkedlist.addLast("Last Item");
        System.out.println("LinkedList Content after addition: " +linkedlist);

        /*This is how to get and set Values*/
        Object firstvar = linkedlist.get(0);
        System.out.println("First element: " +firstvar);
        linkedlist.set(0, "Changed first item");
        Object firstvar2 = linkedlist.get(0);
        System.out.println("First element after update by set method: " +firstvar2);

        /*Remove first and last element*/
        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " +linkedlist);

        /* Add to a Position and remove from a position*/
        linkedlist.add(0, "Newly added item");
        linkedlist.remove(2);
        System.out.println("Final Content: " +linkedlist);




        // Example Two: How to Sort LinkedList
        // In this example, we will demonstrate how to sort a LinkedList using the Collections.sort() method.
        // Please note that for custom sorting of objects, we can use Collections.sort(linkedList, comparator) method.
        //Create a class named “LinkedListsortExample” and add the code below:
        //Create linked list
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("B");
        linkedList.add("D");

        //Unsorted
        System.out.println(linkedList);

        //1. Sort the list
        Collections.sort(linkedList);

        //Sorted
        System.out.println(linkedList);

        //2. Custom sorting
        Collections.sort(linkedList, Collections.reverseOrder());

        //Custom sorted
        System.out.println(linkedList);
    }
}
