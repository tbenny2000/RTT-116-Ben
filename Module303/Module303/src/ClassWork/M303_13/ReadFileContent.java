package ClassWork.M303_13;

import java.io.*;

public class ReadFileContent {

    public static void main(String[] args) {
        whileLoop1();
        whileLoop2();
    }

        public static void whileLoop1() {

            File file = new File("src/temp.txt");

            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                // Declaring a string variable
                String st;
                // another style is assigning to and evaluating at the same time
                // when the end of file is reached br.readLine() will return null !!!!!!!!!!!!!!
                while ((st = br.readLine()) != null) {
                    // Print the string
                    System.out.println(st);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        public static void whileLoop2() {

            File file = new File("src/temp.txt");

            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                // Declaring a string variable
                String st = br.readLine();
                // the 2 loops are the exact the same the only difference is .. in whileLoop1 we are doing 2 operations on a single line
                while (st != null) {
                    // Print the string
                    System.out.println(st);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
