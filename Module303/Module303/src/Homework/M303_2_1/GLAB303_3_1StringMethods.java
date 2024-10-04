package Homework.M303_2_1;

import java.util.Arrays;

public class GLAB303_3_1StringMethods {
    public static void main(String[] args) {

        // 1 length() method
        String str1 = "Java";
        String str2 = "";

        System.out.println(str1.length());  // 4
        System.out.println(str2.length());  // 0
        System.out.println("Java".length());  // 4
        System.out.println("Java\n".length()); // 5
        System.out.println("Learn Java".length()); // 10

        // 2 IsEmpty() method:
        String s1 = "";
        String s2 = "hello";
        System.out.println(s1.isEmpty());      // true
        System.out.println(s2.isEmpty());      // false

        // 3 Trim() method:
        String s3 = "  hello   ";
        System.out.println(s3 + "how are you");        // without trim()
        System.out.println(s3.trim() + "how are you"); // with trim()

        // 4 toLowerCase() method:
        String s4 = "HELLO HOW Are You?";
        String s4lower = s4.toLowerCase();
        System.out.println(s4lower);

        // 5 Java String toUpper() method:
        String s5 = "hello how are you";
        String s5upper = s5.toUpperCase();
        System.out.println(s5upper);

        // 6 concat() method
        //------By using concat method----
        String str3 = "Learn ";
        String str4 = "Java";
        // concatenate str3 and str4
        System.out.println(str3.concat(str4)); // "Learn Java"

        // concatenate str4 and str11
        System.out.println(str4.concat(str3)); // "JavaLearn "

        //--- By using + operator---
        String s6 =  "hello";
        String s7 = "Learners";
        //  String s5 = s6.concat(s7); or
        String s8 = s6 + s7;
        //both of the above statement will give you the same result1
        System.out.println(s8);

        // Three strings are concatenated
        String message = "Welcome " + "to " + "Java";
        System.out.println(message);

        // String Chapter is concatenated with number 2
        String s = "Chapter" + 2; // s becomes Chapter2
        System.out.println(s);

        // String Supplement is concatenated with character B
        String s9 = "Supplement" + 'B'; // s9 becomes SupplementB
        System.out.println(s9);

        // 7 split() method
        String vowels = "a::b::c::d:e";

        // splitting the string at "::"
        // storing the result1 in an array of strings
        String[] result = vowels.split("::");

        // converting array to string and printing it
        System.out.println("result1 = " + Arrays.toString(result));

        // 8 charAt() method: Getting Characters From a String
        String message1 = "Welcome to Java";
        System.out.println("The first character in the message is " + message1.charAt(0));

        // 9 compareTo() method:
        String s10 ="hello";
        String s11 ="hello";
        String s12 ="hemlo";
        String s13 ="flag";
        System.out.println(s10.compareTo(s11)); // 0 because both are equal
        System.out.println(s10.compareTo(s12)); //-1 because "l" is only one time lower than "m"
        System.out.println(s10.compareTo(s13)); // 2 because "h" is 2 times greater than "f"

        // 10 Substrings() method:
        String str5 = "java is fun";

        // extract substring from index 0 to 3
        System.out.println(str5.substring(0, 4));

        // 11 indexOf() method:
        String str6 = "Java is fun";
        int result1;

        // getting index of character 's'
        result1 = str6.indexOf('s');

        System.out.println(result1); // 6

        // getting index of character 'J'
        result1 = str6.lastIndexOf('J');
        System.out.println(result1); // 0

        // the last occurrence of 'a' is returned
        result1 = str6.lastIndexOf('a');
        System.out.println(result1); // 3

        // character not in the string
        result1 = str6.lastIndexOf('j');
        System.out.println(result1); // -1

        // getting the last occurrence of "ava"
        result1 = str6.lastIndexOf("ava");
        System.out.println(result1); // 1

        // substring not in the string
        result1 = str6.lastIndexOf("java");
        System.out.println(result1); // -1

        // 12 contains() method:
        String str7 = "Learn Java";
        Boolean result2;

        // check if str7 contains "Java"
        result2 = str7.contains("Java");
        System.out.println(result2);  // true

        // check if str7 contains "Python"
        result2 = str7.contains("Python");
        System.out.println(result2);  // false

        // check if str7 contains ""
        result2 = str7.contains("");

        System.out.println(result2);  // true

        // 13 replace() method
        String str8 = "abc cba";

        // all occurrences of 'a' is replaced with 'z'
        System.out.println(str8.replace('a', 'z'));

        // all occurences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L', 'J'));
        // character not in the string
        System.out.println("Hello".replace('4', 'J'));
        // all occurrences of "C++" is replaced with "Java"
        System.out.println(str8.replace("C++", "Java"));

        // all occurences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz"));

        // substring not in the string
        System.out.println("Java".replace("C++", "C"));

        // 14 Java String replaceAll()
        // regex for sequence of digits
        String regex = "\\d+";

        // replace all occurrences of numeric
        // digits by a space
        System.out.println(str1.replaceAll(regex, " "));

        // 16 By Using equals() Method
        String s14 ="PerScholas";
        String s15 ="PerScholas";
        String s16 =new String("PerScholas");
        String s17 ="Teksystem";
        System.out.println(s14.equals(s15));//true
        System.out.println(s14.equals(s16));//true
        System.out.println(s14.equals(s17));//false

        // 17 By Using == operator
        String s18 ="Perscholas";
        String s19 ="Perscholas";
        String s20 =new String("Perscholas");
        System.out.println(s18 == s19);//true (because both refer to same instance)
        System.out.println(s18 == s20);//false(because s20 refers to instance created in nonpool)

        // 18 By Using compareTo() method,
        String s21 ="Perscholas";
        String s22 ="Perscholas";
        String s23 ="Perschola";
        String s24 ="PerscholasX";
        System.out.println(s21.compareTo(s22)); //0
        System.out.println(s21.compareTo(s23)); // 1(because s21>s23)
        System.out.println(s21.compareTo(s24)); // -1(because s21<s24 )
    }
}
