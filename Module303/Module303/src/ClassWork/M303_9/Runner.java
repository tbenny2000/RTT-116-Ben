package ClassWork.M303_9;

public class Runner {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.setRadius(10.0);
        // this is setting the static variable PI to 4
        c.setPI(4);
        c.setName("Circle"); // this is implemented in shape class
        System.out.println(c.getName() + " = " + c.getPI());


        Circle c1 = new Circle();
        c1.setRadius(15.0);
        c1.setName("Circle 1");
        // when the object is created PI should be 3.14 but b/c
        // we changed on c and it is a static variable it is
        System.out.println(c1.getName() + " = " + c1.getPI());

        // now we change c1 for PI to be 5 and both circle are now 5
        c1.setPI(5);
        System.out.println(c.getName() + " = " + c1.getPI());
        System.out.println(c1.getName() + " = " + c1.getPI());


        Triangle t = new Triangle();
        t.setBase(10);
        t.setHeight(20);
        t.setName("Triangle");
    }
}
