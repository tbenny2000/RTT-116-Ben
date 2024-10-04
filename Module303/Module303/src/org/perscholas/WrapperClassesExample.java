package org.perscholas;

public class WrapperClassesExample {

    public static void booleanAutoBox(boolean b) {
        System.out.println("Function called with " + b);
    }

    public static void autoBox(int x) {
        System.out.println("Function called with " + x);
    }
    public static void main(String[] args) {
        int x = 5;

        // this is autoboxing - the compiler / JVM will automatically convert b/w the primitive and the wrapper class
        Integer y = x;

        // this is manually converting a primitive int to a wrapper class
        Integer z = Integer.valueOf(x);

        // call the function
        autoBox(5);
        autoBox(x);
        autoBox(y);

        // all java objects can be null
        Integer value = null;

        // a primitive can not be null
        // int v1 = null;

        Boolean b1 = true;
        Boolean b2 = false;

        booleanAutoBox(b1);
        booleanAutoBox(b2);

        // String uses "
        String s1;

        //
    }
}
