package Homework.M303_11Lesson11.GLAB303_11_1GenericMethodAndClass;

public class DemoClass {

    // create a generics method
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }

}
