package org.perscholas;

import java.text.DecimalFormat;
import java.util.StringJoiner;

public class StringExamples {
    public static void main(String[] args) {
        // the total length of the string is 6 characters
        // 0 based indexing
        //          012345
        String s = "abcdef";

        // this will print the length of the string
        System.out.println("The length of the string is: " + s.length());

        // this will print the string in uppercase
        System.out.println("Uppercase = " + s.toUpperCase());

        // manually concat two strings
        String concat = s.concat("ghijk");
        System.out.println(concat);

        System.out.println(s.charAt(0)); // this will print a
        System.out.println(s.charAt(5)); // this will print f
        System.out.println(s.length());
        // System.out.println(s.charAt(6)); // this will produce and error b/c there is not character in pos 6.

        String r = "abc123abc";
        // replace a with z
        System.out.println(r.replace('a', 'z'));

        // replace abc with xyz
        System.out.println(r.replace("abc", "xyz"));

        // replaceAll uses a regular expression
        System.out.println(r.replaceAll("//d", "9"));

        // ===SUBSTRING===
        String fileName = "someimage.jpg";

        // this goes from pos 0 to pos 4 but does not include pos 4.
        System.out.println(fileName.substring(0, 4));
        System.out.println(fileName.substring(1, 5));
        System.out.println(fileName.substring(3, 6));

        // when we use a single argument with substring it is simply the starting pos and it will take the rest of the string
        System.out.println(fileName.substring(4));

        // we want to print out the index of the . in the string
        // indexOf finds the first occurence of whatever your looking for
        System.out.println("The . is in position " + fileName.indexOf("."));

        // last IndexOf will find the las index of whatever you are looking for
        // this can also be taught of search from the left to right instead of right to left.
        // to get the file extension we can use a combo of substring and indexOf
        System.out.println(fileName.substring(fileName.lastIndexOf(".")));

        // how do i get just the filename without the extension
        System.out.println(fileName.substring(0, fileName.lastIndexOf(".")));

        // !!!!! ALWAYS USE .equals when comparing 2 strings
        String s1 = new String("abc");
        String s2 = new String("abc");

        // this is never correct for strings
        System.out.println(s1 == s2);

        // ALWAYS correct way to compare 2 strings is always to use the .equals
        // doing it any other way is ALWAYS WRONG
        System.out.println(s1.equals(s2));

        // this will compare 2 strings without case sensitivity
        System.out.println(s1.equalsIgnoreCase(s2));

        // convert from string to number
        String n = "101";
        // this will thake the string 101 and convert it to the number one hundred and one
        Integer n1 = Integer.parseInt(n);
        System.out.println(n1);

        // this method can throw an exception b/c the string may not contain only numbers.
        // Integer n3 = Integer.parseInt("1234abc");
        // System.out.println(n3);

        // converting from a number to a string is easy
        String n2 = n1.toString();
        System.out.println(n2);

        // !!!! IMPORTANT - String in Java are immutable - meaning they cannot be changed after they are created
        String s4 = "abc";
        String s5 = "123";

        // when s4.toUpperCase is called it creates another brand new string in memory that is ABC
        // it did not modify s4. .. it created a new string
        // then it concatenates on the string s5 when creates yet another new string in memory that is assigned to variables s6
        String s6 = s4.toUpperCase() + s5;
        System.out.println(s6);


        // ========= StringBuffer ==========

        // Potential interview question... why would you use a StringBuffer or a StringBuilder over a regular string
        // answe is... for memory management...String are immutalbe and the JVM creates new string iin memry and then has to garbage collect them
        // where as build and
        // The StringBuffer is mutable meaning the internal content of the StringBuffer can be changed and it is good to use
        // when doing lots of string manipulation is a high volume system
        StringBuffer sb = new StringBuffer();

        // append will add something to the end of the sting and it has the same affect as concat for strings
        // these 2 lines of code are the equivalent of doing "abc" + "123" or using the .concat method on a string

        // 012345
        // abc123

        sb.append("abc");
        sb.append("123");

        //  know this for KBA
        // this will start insert at pos 4
        sb.insert(4, "xyz");

        // replace functionfor String Buffer
        // start at pos 0, goes to pos 3 (but not include pos 3)
        // maybe it is easier to think about replace as 2 operations
        // operation 1)   starting at pos 0 and going o pos 3 will be deleted
        // operation 2)   starting at pos 0 the string will be inserted
        sb.replace(0, 3, "ABCDEF");

        // we can delete from a string buffer
        sb.delete(0,3);

        // not sure anyone would use this in a work environment
        // this just reverses the entire string
        sb.reverse();

        System.out.println(sb.toString());

        // KBA Question...

        // 01234567890
        // ABC
        // DEFG
        // 12345DEFG
        // GFED54321
        // delete GFED5 and the answer is 4321 (kba.delete(0,5);
        StringBuffer kba = new StringBuffer("ABC");
        kba.replace(0,7,"DEFG").insert(0,"12345");
        kba.reverse().delete(0,5);


        /// ========= String Joiner =========

        // a string joiner formats the list of strings and separates each one with a delimiter bud does not put a delimiter at the end
        StringJoiner sj1 = new StringJoiner("|","{","}");
        StringJoiner sj2 = new StringJoiner(":","[","]");

        sj1.add("Jul");
        sj1.add("Jan");
        System.out.println(sj1);

        sj2.add("Feb");
        sj2.add("Mar");
        System.out.println(sj2);

        System.out.println(sj1.merge(sj2).toString());



        // ============ FORMATTING =============
        int i = 1024;
        byte b = 127;
        double d = 1.232, tiny = d / 1000000.0;
        boolean bool = true;
        System.out.format("This is an integer: %d and this is a byte: %d and one more variable %d \n", i, b, 10);
        System.out.format("This is a double: %.4f and this is tiny: %.4e.\n", d, tiny);
        System.out.format("And this is a String: %s", "This is a string.\n");

        // ============ DECIMAL FORMATTING =============
        String pattern = "$##,###,###.##";
        double number = 123456789.123;

        DecimalFormat numberFormat = new DecimalFormat(pattern);
        System.out.println(numberFormat.format(number));

        // ========= TRIM ============
        String t = "   abc123     ";
        System.out.println("->" + t + "<-");
        System.out.println("->" + t.trim() + "<-");

        // =========== Split ========
        String vowels = "a,e,i,o,u";

        //splitting the string at ","
        String[] result = vowels.split(":");

        //
        System.out.println("result =" + result);



        // CTRL + ALT + L  Reformats the code
    }
}
