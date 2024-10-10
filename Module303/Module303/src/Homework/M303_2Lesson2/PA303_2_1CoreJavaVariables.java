package Homework.M303_2Lesson2;

public class PA303_2_1CoreJavaVariables {

    public static void main(String[] args) {

        // Write a program that declares two integer variables, assigns an integer to each,
        // and adds them together.Assign the sum to a variable. Print out the result.
        int a = 5;
        int b = 3;
        int sum = a + b;
        System.out.println("The sum of this is: " + sum);
        System.out.println("****************\n");

        // Write a program that declares two double variables, assigns a number to each,
        // and adds them together. Assign the sum to a variable. Print out the result.
        double c = 2.5;
        double d = 5.5;
        double sum2 = c + d;
        System.out.println("The sum of this is: " + sum2);
        System.out.println("****************\n");

        // Write a program that declares an integer variable and a double variable,
        // assigns numbers to each, and adds them together. Assign the sum to a variable.
        // Print out the result. What variable type must the sum be? (double)
        int f = 6;
        double g = 6.5;
        double sum3 = f + g;
        System.out.println("The sum of this is: " + sum3);
        System.out.println("****************\n");

        // Write a program that declares two integer variables, assigns an integer to each,
        // and divides the larger number by the smaller number. Assign the result to a variable.
        // Print out the result. Now change the larger number to a decimal.
        // What happens? When you change from int to decimal you will get an error saying that it
        // requires an int but was provided a double.
        // What corrections are needed? Either cast it or change the "int" to "double".
        int h = 4;
        //int i = 7;
        double i = 7.0;
        int sum4 = (int) (i / h);
        System.out.println("The sum of this is: " + sum4);
        System.out.println("****************\n");

        // Write a program that declares two double variables, assigns a number to each,
        // and divides the larger by the smaller number. Assign the result to a variable.
        // Print out the result. Now, cast the result to an integer. Print out the result again.
        double j = 6;
        double k = 10;
        // double sum5 = k / j;
        int sum5 = (int) (k / j);
        System.out.println("The sum of this is " + sum5);
        System.out.println("****************\n");

        // Write a program that declares two integer variables, x and y, and assigns the
        // number 5 to x and the number 6 to y. Declare a variable q and assign y/x to it
        // and print q. Now, cast y to a double and assign it to q. Print q again.

        int x = 5;
        int y = 6;
        double q = y / x;
        System.out.println(q);
        q = (double) y / x;

        System.out.println("Castying y to double and assign it to q: " + q);
        System.out.println("****************\n");

        // Write a program that declares a named constant and uses it in a calculation.
        // Print the result.
        int Cats = 5;
        int Dogs = 6;
        int totalPets = Cats + Dogs;
        System.out.println("The result of toatl pets is: " + totalPets);
        System.out.println("****************\n");

        // Write a program where you create three variables that represent products at a cafe.
        // The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        // Assign prices to each product. Create two more variables called subtotal and totalSale
        // and complete an “order” for three items of the first product, four items of the second
        // product, and two items of the third product. Add them all together to calculate the subtotal.
        // Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the
        // totalSale amount. Be sure to format the results to two decimal places.
        double greenTea = 0.99;
        double coffee = 5.50;
        double water = 1.25;

        double subTotal;
        double totalSale;
        double SALES_TAX = 0.06;

        int quantityGreenTea = 3;
        int quantityCoffee = 4;
        int quantityWater = 2;

        subTotal = (quantityGreenTea * greenTea) + (quantityCoffee * coffee) + (quantityWater * water);
        totalSale = subTotal + (subTotal * SALES_TAX);
        System.out.printf("Subtotal: $%.2f%n", subTotal);
        System.out.printf("Total Sale (with tax): $%.2f%n", totalSale);
        System.out.println("****************\n");

    }
}
