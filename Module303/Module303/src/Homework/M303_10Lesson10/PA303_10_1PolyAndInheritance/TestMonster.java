package Homework.M303_10Lesson10.PA303_10_1PolyAndInheritance;

public class TestMonster {
    public static void main(String[] args) {

        Monster m1 = new FireMonster("r2u2");
        Monster m2 = new WaterMonster("u2r2");
        Monster m3 = new StoneMonster("r2r2");


        System.out.println(m1.attack());  // Output: Attack with fire!
        System.out.println(m2.attack());  // Output: Attack with water!
        System.out.println(m3.attack());  // Output: Attack with stones!


        // m1 dies, generates a new instance and re-assign to m1.
        m1 = new StoneMonster("a2b2");
        System.out.println(m1.attack());  // Output: Attack with stones!


        Monster m4 = null; // Declare m4 as null to simulate the problem
        if (m4 == null) {
            System.out.println("!^_&^$@+%$* I don't know how to attack!"); // Output the error message
        }
    }
}
