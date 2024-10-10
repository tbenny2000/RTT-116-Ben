package coffe_shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeShop {
    // we will use this in a couple functions to read input from the user
    private Scanner scanner = new Scanner(System.in);

    // this is a class level varibales that will contain out list of products for sale
    // best practice is to define these at the top of the class
    private List<Product> products = new ArrayList<Product>();

    // this will hold the products that we are going to purchase
    private List<Product> cart = new ArrayList<>();


    private void initProducts() {
        Product p1 = new Product("Small coffee", 4.57, 0);
        products.add(p1);

        Product p2 = new Product("Large coffee", 7.99, 0);
        products.add(p2);

        Product p3 = new Product("Sugar cookie", 5.89, 0);
        products.add(p3);

        Product p4 = new Product("Egg Sandwich", 6.49, 0);
        products.add(p4);
    }

    private void printProductMenu() {
        for (int count = 0; count < products.size(); count++) {
            Product p = products.get(count);
            // count + 1 the compiler will recognize the math and increment the value of count
            // before using it to creat the string that is printed
            System.out.println((count + 1) + ") " + p.getName() + " \t" + p.getPrice());
        }
        // gives a space line that divides the menu and the options
        System.out.println("\n");
    }

    private int printMainMenu() {
        System.out.println("1) See product menu");
        System.out.println("2) Purchase product");
        System.out.println("3) Checkout product");
        System.out.println("4) Exit");

        System.out.println("\nEnter selection: ");

        try {
            int selection = scanner.nextInt();
            return selection;
        } catch (Exception e) {
            System.out.println("Invalid selection " + e.getMessage());
            return -1;
        } finally {
            scanner.nextLine();
        }
    }

    public void addProductToCart() {
        // 1 display items for sale
        printProductMenu();

        // 2 prompt the user to enter an item # to buy
        System.out.println("Enter product number: ");
        int selection = scanner.nextInt();
        scanner.nextLine();

        // we want to check that the user has enter a valid product number
        if (selection < 1 && selection <= products.size()) {
            Product p = products.get(selection - 1);
            cart.add(p);
            System.out.println("Added " + p.getName() + " to your cart.\n");
        } else {
            System.out.println("Invalid item selection!");
        }

        // 4 how many do you want to buy
        // 5 make adjustment to quantity on product
    }

    public void checkout() {
        System.out.println("===Items in your cart ====");

        // list the item in the cart
        double subtotal = 0.0;
        for (Product item : cart) {
            System.out.println(item.getName() + " \t $" + item.getPrice());
            subtotal = subtotal + item.getPrice();
        }
        System.out.println("");
        System.out.println("Subtotal\t\t $" + subtotal);

        // calculate tax
        // assume there is a 9% tax to be applied to the order
        double tax = subtotal * 0.09;
        System.out.println("Tax\t\t\t\t $" + tax);

        // calculate total amount
        // adding and additional () will cause it to do the math
        double total = (subtotal + tax);
        System.out.println("Subtotal\t\t $" + total + "\n");
    }

    public void start() {

        // this becomes similar to the main method in that it will be where our project starts and run
        // 1) initialize the products for sale
        initProducts();

        // 2) print the menu and get back the user selected input
        while (true) {
            // print the menu and get back the user selected input
            int selection = printMainMenu();

            // 3) print the list of products for sale
            if (selection == 1) {
                // print the product menu
                printProductMenu();
            } else if (selection == 2) {
                // purchase product / add to cart
                addProductToCart();
            } else if (selection == 3) {
                // checkout
                checkout();
            } else if (selection == 4) {
                // exit
                // we are exiting with a value of 0 means successful exit
                System.out.println("Goodbye!");
                System.exit(0);
            } else {
                System.out.println("Invalid command entered! Try again." + selection + "\n");
            }
        }

    }

    public static void main(String[] args) {
        CoffeeShop cs = new CoffeeShop();
        cs.start();
    }
}
