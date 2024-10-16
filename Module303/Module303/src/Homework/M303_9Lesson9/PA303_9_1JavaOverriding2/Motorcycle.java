package Homework.M303_9Lesson9.PA303_9_1JavaOverriding2;

public class Motorcycle extends Bicycle{

    @Override
    String defineMe() {
        return "a cycle with an engine.";
    }
    Motorcycle() {
        System.out.println("Hello I am a motorcycle, I am " + defineMe());


        String temp = super.defineMe(); // Fix this line

        System.out.println("My ancestor is a cycle who is " + temp);
    }
}
