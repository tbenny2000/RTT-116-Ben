package M303_9;

public class Circle extends Shape{

    // when we use the staic keyword...there is only variable PI for all instances of circle
    private static double PI = 3.14159;

    // each instance of the class circle in memory gets its own radius variable
    private double radius;


    public double getRadius() {
        return radius;
    }

    public static double getPI() {
        return PI;
    }

    public static void setPI(double PI) {
        Circle.PI = PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
