package Homework.M303_2Lesson2;

public class GLAB303_2_2TypeCasting {
    public static void main(String[] args) {

        // AutoTypeConversion
        int x = 20;
        double y = 40.5;
        long p = 30;
        float q = 10.60f;

        //int h = x + y;  // error; cannot convert from double to int.
        double z = x + y;
        System.out.println("Sum of two numbers: " + z);

        // long r = p - q; // error; cannot convert from float to long.
        float r = p - q;
        System.out.println("Subtraction of two numbers: " + r);
        System.out.println("********************************");

        // AutoPromoteTest
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        // Expression:
        double result = (f * b) + (i / c) - (d * s);
        //Result after all the promotions are done.
        System.out.println("result = " + result);
        System.out.println("****************\n");

        // ExplicitTest
        double t = 100.04;
        // explicit type casting
        long l = (long) t;
        int u = (int)l;
        System.out.println("Double value "+ t);
        System.out.println("Long value "+l);
        System.out.println("Int value "+ u);
        System.out.println("****************\n");

        byte g;
        int h = 257;
        double dou = 323.142;
        System.out.println("Conversion of int to byte.");
        g = (byte) h;
        System.out.println("h = " + h + " g = " + g);
        System.out.println("Conversion of double to int.");

        h = (int) dou;
        System.out.println("dou = " + dou + " g = " + h);
        System.out.println("Conversion of double to byte.");

        g = (byte) dou;
        System.out.println("dou = " + dou + " g = " + g);
        System.out.println("Conversion of long to int.");
        System.out.println("****************\n");

    }
}
