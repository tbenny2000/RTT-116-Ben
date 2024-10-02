package org.perscholas;

// Primitive data types - includes byte, short, int, long, float, double, boolean, and char.
// Non-primitive data type are also called Object references, Reference variables, and Reference data types
// (e.g., String, Arrays and Classes).

public class SecondClass {
    int variableName = 5;

    int thisVariableHasLongName = 5;

    double are = 0.5;

    boolean question = true;

    boolean answer = false;

    boolean thisIsALongVariableName = false;

    boolean publicVariable = false;


    public static final void main(String[] args) {

        boolean oneTime = false;

        oneTime = false;

        char a = 'A';

        // this way is depreciated and no longer the best way of creating a new Integer(non primitive)
        //Integer i = new Integer(45);

        // it has been replaced with this
        Integer ii = Integer.valueOf(45);

        // Integer calss isa an actual calls and hs methods on it.
        String iiString = ii.toString();

    }
}
