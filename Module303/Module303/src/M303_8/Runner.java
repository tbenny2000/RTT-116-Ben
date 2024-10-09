package M303_8;

public class Runner {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(); // this is called instantiating the object
        System.out.println(r1.toString());
        System.out.println("The area is " + r1.calculateArea());
        System.out.println("The perimeter is " + r1.calculatePerimeter());

        r1.setWidth(30);
        r1.setHeight(20);

        // this is an error b/c the function is set to private
        // r1.notAvailable();

        // this is ok b/c Runner and Rectangle are in the same package
        r1.partlyAvailable();

        System.out.println(r1.toString());
        System.out.println("The area is " + r1.calculateArea());
        System.out.println("The perimeter is " + r1.calculatePerimeter());

        Rectangle r2 = new Rectangle(10, 20); // this is called instantiating the object
        System.out.println(r2.toString());
        System.out.println("The area is " + r2.calculateArea());
        System.out.println("The perimeter is " + r2.calculatePerimeter());

    }
}
