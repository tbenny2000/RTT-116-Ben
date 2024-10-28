package coffe_shop;

import java.util.*;
import java.util.stream.Collectors;

public class CoffeeShop {
    // we will use this in a couple functions to read input from the user
    private Scanner scanner = new Scanner(System.in);

    // this is a class level varibales that will contain out list of products for sale
    // best practice is to define these at the top of the class
    private List<Product> products = new ArrayList<Product>();

    // this will hold the products that we are going to purchase
    private List<Product> cart = new ArrayList<>();


    private void initProducts() {
        Product p1 = new Product("Small Coffee", 8.45, 0);
        products.add(p1);

        Product p2 = new Product("Large Coffee", 2.99, 0);
        products.add(p2);

        Product p3 = new Product("Sugar Cookie", 5.89, 0);
        products.add(p3);

        Product p4 = new Product("Egg Sandwich", 6.49, 0);
        products.add(p4);

        Product p5 = new Product("Ginger Cookie", 5.49, 0);
        products.add(p5);

        // load the products form the file
        List<Product> loaded = new ProductLoader().loadProducts();
        loaded.addAll(products);


        // lets sort the list by the price
        // https://stackoverflow.com/questions/40517977/sorting-a-list-with-stream-sorted-in-java
        // stream will not modify the original list that you streamed

        List<Product> sorted = products.stream().sorted(Comparator.comparing(Product::getPrice)).toList();

        // this just prints the products and when we run this we will have to make a fix
        // sorted.forEach(p -> System.out.println(p));

        // this will modify the original list...using stream will not modify the original list
        products.sort(Comparator.comparing(Product::getPrice).thenComparing(Product::getName));
        //products.forEach(p -> System.out.println(p));

        sortByPrice(sortByPrice(sorted));
    }

    private List<Product> sortByPrice(List<Product> source) {
        int n = source.size();
        // Perform bubble sort
        for (int outer = 0; outer < n - 1; outer++) {
            for (int inner = 0; inner < n - outer - 1; inner++) {
                Product p0 = source.get(inner);
                Product p1 = source.get(inner + 1);

                // Swap if the current product's price is greater than the next one
                if (p0.getPrice() > p1.getPrice()) {
                    // Swap the products
                    source.set(inner, p1);
                    source.set(inner + 1, p0);
                }
            }
        }
        return null;  // Return the sorted list
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



    private int printMainMenu() throws InvalidInputException {
        System.out.println("1) See product menu");
        System.out.println("2) Purchase product");
        System.out.println("3) Checkout product");
        System.out.println("4) Product search");
        if (cart.size() > 0) {
            System.out.println("Delete product");
        }
        System.out.println("5) Delete product");
        System.out.println("6) Exit");

        return readNumberFromUser("\nEnter Selection :");
    }

    // by adding the throws clause here, I am specifically saying this function can (but may)
    private int readNumberFromUser(String question) throws InvalidInputException {
        System.out.println(question);
        try {
            int selection = scanner.nextInt();
            // normally a return stops execution of code at that point and executes the function
            // ***** !!!!!! in this cas it will still call the finally block
            return selection;
        } catch (Exception e) {
            // this is logic we are adding as an engineer so we know there was a problem
            // this is not always the best of handling things
            System.out.println("Invalid input: " + e.getMessage());
            throw new InvalidInputException("Invalid input: " + e.getMessage());
        } finally {
            // this is a good example of usage for a finally block is to clear the Scanner so it is ready for the
            // next time this function is called.
            scanner.nextLine();
        }
    }

    public void addProductToCart() throws InvalidInputException {
        // 1 display items for sale
        printProductMenu();

        try {
            // 2 prompt the user to enter an item # to buy
            int selection = readNumberFromUser("Enter product number: ");

            // prompt the user to enter how many they would like to buy
            if (isProductSelectionValid(selection)) {
                // if user does not enter a valid item from the menu then there is no reason to ask how many
                // prompt the user to enter how many they would ike to buy
                int quantity = readNumberFromUser("Enter quantity: ");

                //error checking can happen here to make sure the user enter a positive number
                if (quantity <= 0) {
                    System.out.println("Must buy at least 1 item");
                } else {
                    // 3 add to the cart array
                    // we are subtracting 1 from the user input to ge the real position in the array
                    // b/c most people do not have a concept of the oth item in a list
                    Product p = products.get(selection - 1);
                    p.setQuantity(p.getQuantity() + quantity);

                    // if the product does not already exist in the cart then we can add the product to the cart
                    if (!doesSelectedProductExistsInCart(p)) {
                        cart.add(p);
                    }
                    System.out.println("Added " + p.getName() + " to your cart.\n");
                }
            } else {
                System.out.println("Invalid item selection!");
            }
        } catch (InvalidInputException iie) {
                System.out.println("=====HERE======");
        }
    }

    private boolean isProductSelectionValid(int selectedProduct) {
        if( selectedProduct >= 1 && selectedProduct <= products.size()) {
            return true;
        }
        return false;
    }

    private boolean doesSelectedProductExistsInCart(Product purchase) {
        boolean found = false;
        // start looping over all the items in the cart and if the name of the purchased item is the same
        // name as one of the products in the car then we know it is already in the cart
        for (Product item : cart) {
            if (item.getName().equals(purchase.getName())) {
                found = true;
                break;
            }
        }
        return found;
    }

    private void searchProductByName(String searchPhrase) {
        List<Product> searchResults = products.stream()
                .filter(p -> p.getName().toLowerCase().contains(searchPhrase.toLowerCase()))
                .collect(Collectors.toList());

        if (searchResults.isEmpty()) {
            System.out.println("No products match your search.");
        } else {
            searchResults.forEach(p -> System.out.println(p.toString()));
        }
    }

    public void checkout() {
        System.out.println("===Items in your cart ====");
        double subtotal = 0.0;
        for (Product item : cart) {
            double itemTotal = item.getPrice() * item.getQuantity();
            System.out.println(item.getName() + " \t " + item.getQuantity() + "\t $" + item.getPrice() + "\t Total $" + itemTotal);
            subtotal = subtotal + itemTotal;  // Add the total for this item (price * quantity)
        }


        System.out.println("");
        System.out.printf("Subtotal\t\t $%.2f\n", subtotal);
        //System.out.printf("Subtotal\t\t $" + String.format("%.2f") + subtotal);

        // calculate tax
        // assume there is a 9% tax to be applied to the order
        double tax = subtotal * 0.09;
        System.out.printf("Tax\t\t\t\t $%.2f\n", tax);
        //System.out.printf("Tax\t\t\t\t $" + String.format("%.2f") + tax);


        // calculate total amount
        // adding and additional () will cause it to do the math
        double total = (subtotal + tax);
        System.out.printf("Total\t\t $%.2f\n", total);
    }

    public void productSearch() {
        System.out.println("Enter a product name to search for\n: ");
        String search = scanner.nextLine();

        // this line of code filters the list of products based if the search input s in the string
        List<Product> results = products.stream().filter(p -> p.getName().toLowerCase().contains(search.toLowerCase())).toList();

        // to make it case insensitive then use toLoweCase or toUpperCase
        // this is a common technique when you want to compare case insensitive
        // List<Product> results = products.stream().filter(p -> p.getName().contains(search)).toList();

        if (results.isEmpty() ) {
            System.out.println("No results were fond " + search + ".\n");
        } else {
            results.forEach(p -> System.out.println(p));
        }
    }

    private Optional<Product> findProductInCart(String productName) {
        return cart.stream().filter(p -> p.getName().equals(productName)).findFirst();
    }

    public void deleteProduct() {
        System.out.println("=========== DELETE PRODUCT ==================");

        //printProductMenu(cart);
        try {
            int selection = readNumberFromUser("Enter product number to remove: ");

            // do some error checking here on both of these
            int quantity = readNumberFromUser("Enter quantity to remove: ");

            // lets assume the user only enters valid data
            Product remove = cart.get(selection - 1);
            if (remove.getQuantity() < quantity) {
                remove.setQuantity(remove.getQuantity() - quantity);
            } else {
                // this remove the item from the cart
                cart.remove(selection - 1);
            }

        } catch (Exception e) {
            System.out.println("Invalid product selection");
        }
    }

    public void start() throws InvalidInputException {
        // this becomes similar to the main method in that it will be where our project starts and run
        // 1) initialize the products for sale
        initProducts();

        // 2) print the menu and get back the user selected input
        while (true) {
            try {
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
                System.out.println("Enter product name or number: ");
                String searchPhrase = scanner.nextLine();
                searchProductByName(searchPhrase);
            } else if (selection == 5 && cart.size() > 0) {
                    deleteProduct();
            } else if (selection == 6) {
                // exit
                // we are exiting with a value of 0 means successful exit
                System.out.println("Goodbye!");
                System.exit(0);
            } else {
                System.out.println("Invalid command entered! Try again." + selection + "\n");
            }
        } catch (InvalidInputException iie) {
                System.out.println("Invalid selection: ");}
        }

    }

    public static void main(String[] args) throws InvalidInputException {
        CoffeeShop cs = new CoffeeShop();
        cs.start();
    }
}
