//package org.perscholas.SBA.Question1;
//
//import java.util.ArrayList;
//
//public class ArrayToList extends MyList {
//    private ArrayList<String> list;
//
//    // Constructor to initialize the internal ArrayList
//    public ArrayToList() {
//        list = new ArrayList<>();
//    }
//
//    // Convert an array of strings into the internal ArrayList
//    @Override
//    public void convert(String[] a) {
//        list.clear(); // Clear any existing content
//        for (int i = 0; i < a.length; i++) {
//            list.add(a[i]); // Add element to the list
//            System.out.println("I have added the string: " + a[i] + " at the index: " + i);
//        }
//    }
//
//    // Replace the string at the given index with an empty string
//    @Override
//    public void replace(int idx) {
//        if (idx >= 0 && idx < list.size()) {
//            String oldString = list.get(idx); // Get the string to be replaced
//            list.set(idx, ""); // Replace with an empty string
//            System.out.println("I have replaced the string: " + oldString + " with a null string");
//        }
//    }
//
//    // Compact the list by removing empty strings and return a new ArrayList
//    @Override
//    public ArrayList<String> compact() {
//        ArrayList<String> compactedList = new ArrayList<>();
//        for (String s : list) {
//            if (!s.isEmpty()) { // Only add non-empty strings
//                compactedList.add(s);
//            }
//        }
//        return compactedList;
//    }
//}