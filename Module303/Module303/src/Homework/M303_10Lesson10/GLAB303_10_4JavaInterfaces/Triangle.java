package Homework.M303_10Lesson10.GLAB303_10_4JavaInterfaces;

public class Triangle implements Movable{

    private int x, y; // Current coordinates of the triangle
    private int base, height;

    public Triangle(int x, int y, int base, int height) {
        this.x = x;
        this.y = y;
        this.base = base;
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
        return "Triangle coordinates: (" + x + ", " + y + ")";
    }

    public void display() {
        System.out.println(getCoordinate() + ", Base: " + base + ", Height: " + height);
    }
}
