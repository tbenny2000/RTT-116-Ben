package M303_9;

public abstract class Shape implements AreaCalculation{


    //  This is also called the SUPER CLASS
    // you have 2 different techniques for accomplishing polymorphism behavior
    // 1) is by using an interface allowing the child classes to provide the implementation
    // 2) is by using an abstract method that allows child classes to provide the implementation

    private String name;

    // this is another way of declaring something that the children must implement
    // abstract methods must be implemented by the children
    public abstract double calculatePerimeter();

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

}
