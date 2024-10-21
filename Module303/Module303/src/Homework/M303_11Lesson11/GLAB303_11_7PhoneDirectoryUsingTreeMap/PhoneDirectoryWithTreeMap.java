package Homework.M303_11Lesson11.GLAB303_11_7PhoneDirectoryUsingTreeMap;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectoryWithTreeMap {

    // Learning Objective:
    // By the end of this lesson, learners will be able to utiliZe the TreeMap.
    // Scenario
    // Finds the phone number, if any, for a given name and returns the phone number associated with the
    // name if the name does not occur in the phone directory, and then returns the value as null.
    // Associates a given name with a given phone number.  If the name already exists in the phone directory,
    // the new number replaces the old one. Otherwise, a new name/number pair is added. The name and number
    // should both be non-null.  An IllegalArgumentException is thrown if this is not the case
    // Instructions
    // Step 1: Create a new Java project and create a new Class named “PhoneDirectoryWithTreeMap,” and then write the below code in the class.

    /**
     * The TreeMap that will store the data.  Both key and value are
     * of type String.  The key represents a name and the value represents
     * the associated phone number.
     */
    private TreeMap<String,String> data;

    /**
     * Constructor creates an initially empty directory.
     */
    public PhoneDirectoryWithTreeMap() {
        this.data = new TreeMap<String,String>();
    }

    /**
     * Finds the phone number, if any, for a given name.
     * @return The phone number associated with the name; if the name does
     *    not occur in the phone directory, then the return value is null.
     */
    public String getNumber( String name ) {
        return   this.data.get(name);
    }

    /**
     * Associates a given name with a given phone number.  If the name
     * already exists in the phone directory, then the new number replaces
     * the old one.  Otherwise, a new name/number pair is added.  The
     * name and number should both be non-null.  An IllegalArgumentException
     * is thrown if this is not the case.    */
    public void putNumber( String name, String number ) {
        if (name == null || number == null)
            throw new IllegalArgumentException("name and number cannot be null");
        this.data.put(name,number);
    }

    /**  Write the contents of the phone directory to System.out.
     */
    public void print() {
        for ( Map.Entry<String,String> entry :   this.data.entrySet() )
            System.out.println( entry.getKey() + ":  " + entry.getValue() );
    }

} // end class PhoneDirectoryWithTreeMap