package Homework.M303_10Lesson10.GLAB303_10_4JavaInterfaces;

public class MyRunner {
    public static void main(String[] args) {

        Circle c1 = new Circle(1, 2, 2);
        System.out.println("Area of Circle " + c1.getArea());
        System.out.println("Coordinates are " + c1.getCoordinate());

        c1.moveDown();
        System.out.println("After move Down, Coordinates are " + c1.getCoordinate());

        c1.moveRight();
        System.out.println("After move right, Coordinates are " + c1.getCoordinate());

        c1.moveUp();
        System.out.println("After move Up, Coordinates are " + c1.getCoordinate());

        c1.moveLeft();
        System.out.println("After move left, Coordinates are " + c1.getCoordinate());


        System.out.println("--------Test Polymorphism-------");
        Movable c2 = new Circle(5, 10, 200);  // upcast
        c2.moveUp();
        System.out.println("After move up , Coordinates are " + c2.getCoordinate());

        c2.moveLeft();
        System.out.println("After move Left , Coordinates are " + c2.getCoordinate());
        System.out.println("*******************====****************");


        Rectangle rectangle = new Rectangle(0, 0, 10, 5);
        rectangle.display();

        rectangle.moveRight();
        rectangle.moveUp();
        rectangle.display();

        Triangle triangle = new Triangle(1, 1, 6, 4);
        triangle.display();

        triangle.moveLeft();
        triangle.moveDown();
        triangle.display();
    }
}
