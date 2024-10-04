package Homework.M303_2_2;

public class PA303_2_1CoreJavaVariables {

    public static void main(String[] args) {

        // Write a program that declares two integer variables, assigns an integer to each,
        // and adds them together.Assign the sum to a variable. Print out the result.
        int a = 5;
        int b = 3;
        int sum = a + b;
        System.out.println(sum);

        // Write a program that declares two double variables, assigns a number to each,
        // and adds them together. Assign the sum to a variable. Print out the result.
        double c = 2.5;
        double d = 5.5;
        double sum2 = c + d;
        System.out.println(sum2);

        // Write a program that declares an integer variable and a double variable,
        // assigns numbers to each, and adds them together. Assign the sum to a variable.
        // Print out the result. What variable type must the sum be? (double)
        int f = 6;
        double g = 6.5;
        double sum3 = f + g;
        System.out.println(sum3);

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
        System.out.println(sum4);

        // Write a program that declares two double variables, assigns a number to each,
        // and divides the larger by the smaller number. Assign the result to a variable.
        // Print out the result. Now, cast the result to an integer. Print out the result again.
        double j = 6;
        double k = 10;
        double sum5 = k / j;
        System.out.println(sum5);
        // System.out.println(cast.int.sum5);

        // Write a program that declares two integer variables, x and y, and assigns the
        // number 5 to x and the number 6 to y. Declare a variable q and assign y/x to it
        // and print q. Now, cast y to a double and assign it to q. Print q again.




        // Write a program that declares a named constant and uses it in a calculation.
        // Print the result.


        // Write a program where you create three variables that represent products at a cafe.
        // The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        // Assign prices to each product. Create two more variables called subtotal and totalSale
        // and complete an “order” for three items of the first product, four items of the second
        // product, and two items of the third product. Add them all together to calculate the subtotal.
        // Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the
        // totalSale amount. Be sure to format the results to two decimal places.
        String greenTea;
        String coffee;
        String water;

        greenTea = "greenTea";
        coffee = "coffee";
        water = "water";


    }
}
