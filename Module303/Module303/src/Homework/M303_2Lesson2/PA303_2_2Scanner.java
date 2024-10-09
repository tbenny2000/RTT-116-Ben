package Homework.M303_2_2;

import java.util.Scanner;

public class PA303_2_2Scanner {
    public static void main(String[] args) {

        // This assessment will be administered through HackerRank.
        // Please complete the following Java practices by opening the links below java
        // Stdin and Stdout I and Java Stdin and Stdout II

        // Java Stdin and Stdout I
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(a);
        int b = s.nextInt();
        System.out.println(b);
        int c = s.nextInt();
        System.out.println(c);
        s.close();

        // Java Stdin and Stdout II
        //Scanner s = new Scanner(System.in);
        int f = s.nextInt();
        double e = s.nextDouble();
        s.nextLine();
        String d = s.nextLine();

        System.out.println("String: " + d);
        System.out.println("Double: " + e);
        System.out.println("Int: " + f);

        s.close();

    }
}
