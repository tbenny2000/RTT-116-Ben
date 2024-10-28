//import org.perscholas.SBA.Question1.ArrayToList;
//import org.perscholas.SBA.Question1.InvalidStringException;
//import org.perscholas.SBA.Question1.MyList;
//
//import java.util.ArrayList;
//import java.util.Random;
//import java.util.Scanner;
//
//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Random rand = new Random(0);
//
//        // Read the number of strings
//        int n = Integer.parseInt(sc.nextLine());
//        String[] a = new String[n];
//
//        // Read strings into the array
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextLine();
//        }
//
//        // Create an instance of ArrayToList
//        MyList obj = new ArrayToList();
//
//        // Convert the array into the list
//        obj.convert(a);
//
//        // Perform random replacements
//        int x = rand.nextInt(n);
//        for (int i = 0; i < x; i++) {
//            obj.replace(rand.nextInt(n));
//        }
//
//        // Get the compacted list
//        ArrayList<String> s = obj.compact();
//
//        // Check if any string starts with a lowercase letter
//        for (String str : s) {
//            if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') {
//                try {
//                    throw new InvalidStringException("This is an invalid string");
//                } catch (InvalidStringException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//        }
//    }
//}