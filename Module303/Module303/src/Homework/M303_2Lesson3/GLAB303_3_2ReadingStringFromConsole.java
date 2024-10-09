package Homework.M303_2_1;

import java.util.Scanner;

public class GLAB303_3_2ReadingStringFromConsole {
    public static void main(String[] args) {

        // Example 1
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three words separated by spaces: ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
        System.out.println("s3 is " + s3);

        // Example 2
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = input2.nextLine();
        char ch = s.charAt(0);
        System.out.println("The character entered is " + ch);
    }
}
