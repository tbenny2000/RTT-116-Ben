package Homework.M303_10Lesson10.GLAB303_10_4JavaInterfaces;

public class Rectangle implements Movable{

    private int x, y; // Current coordinates of the rectangle
    private int width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public String getCoordinate() {
        return "Rectangle coordinates: (" + x + ", " + y + ")";
    }

    public void display() {
        System.out.println(getCoordinate() + ", Width: " + width + ", Height: " + height);
    }
}
