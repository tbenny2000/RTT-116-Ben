package ClassWork.M303_11;

import java.util.*;

public class ListSetExample {

    public static void main(String[] args) {

        // this is used 95% of the time- vast majority ofw what we do as engineers uses a list
        List<Integer> inList = new ArrayList<>();
        inList.add(2);
        inList.add(3);
        inList.add(2);
        inList.add(1);
        inList.add(3);
        for (Integer i : inList) {
            System.out.println(i);
        }
        System.out.println("===================");

        // important to understand what a set is - basically it can be used to duplicate data
        Set<Integer> intSet = new HashSet<>();
        intSet.add(2);
        intSet.add(3);
        intSet.add(3);
        intSet.add(1);

        // not only did it not maintain the order in which I added the elements
        // it removed the duplicate 3 that I added
        for (Integer i : intSet) {
            System.out.println(i);

            if (i == 3) {
                // IMPORTANT TO KNOW
                // you can not remove an element from the list inside a regular for loop
                // it is always wrong and will cause an exception
            }
        }


        // ================ ITERATOR
        // first we need to get the iterator from the list
        Iterator<Integer> iterator = intSet.iterator();

        // loop over the list using an iterator, we check to make sure the iterator (list) has a next element
        while (iterator.hasNext()) {
            // the .next function has 2 operations, first is to return the element at the pointer and
            // second to move the pointer over 1 element
            Integer i = iterator.next();

            // primary use for an iterator is when you want to remove something from the list while you are iterating the list
            if (i == 3) {
                iterator.remove();
            }
        }
        System.out.println("===================");
    }
}
