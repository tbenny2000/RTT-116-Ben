package Homework.M303_10Lesson10.PA303_10_1PolyAndInheritance;

public abstract class Monster {

    String name;

    // Constructor to initialize the name
    public Monster(String name) {
        this.name = name;
    }

    // Abstract method to be implemented by subclasses
    abstract String attack();
}
