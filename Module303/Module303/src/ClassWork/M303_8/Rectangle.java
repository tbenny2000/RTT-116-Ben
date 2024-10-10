package ClassWork.M303_8;

public class Rectangle {

    // these are considered class members or class variables
    // we are not directly exposing these to the outside world... thus they are private class memebers
    // the best practice
    private int height;
    private int width;

    // this is a constructor and this one takes no arguments
    public Rectangle() {
        // this is run whenever the code contains new Square()
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    // we use what are called getters and setters to change the values of height and width
    // very very very common practice in java and will see it all over the place
    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    // his method is on alljava object and is used to return a string representation of this object
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }

    public int calculateArea() {
        return width * height;
    }

    public int calculatePerimeter() {
        return (width * 2) + (height * 2);
        // return width + width + height + height;
    }

    private void notAvailable() {
        // this is only available within the rectangle class itself
        // not available outside the method
    }

    protected void partlyAvailable() {
        // protected is available to everything in the same package
    }
}
