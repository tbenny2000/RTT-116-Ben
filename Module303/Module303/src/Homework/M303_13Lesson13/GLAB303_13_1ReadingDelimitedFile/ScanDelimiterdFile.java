package Homework.M303_13Lesson13.GLAB303_13_1ReadingDelimitedFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScanDelimiterdFile {

    // Example 1
    // Click here to Download the Dummy file (Car.csv).
    // Remember the path or location of the downloaded file. We will use that file in this Lab.
    // Create a class named ScanDelimiterdFile, or give any name to the class. Write the code below in that class.
    // Note: Do not forget to change the path or location of the file (cars.csv) at line number 9.

    public static void main(String[] args) throws FileNotFoundException {

        try {
            String location = "C:\\Users\\tbenn\\development\\RTT-116-Classwork\\Module303\\Module303\\src\\Homework\\M303_13Lesson13\\cars.csv";
            File file = new File(location);
            Scanner input = new Scanner(file);
            ArrayList<String[]> data = new ArrayList<String[]>();
            while (input.hasNextLine()) {
                String Line = input.nextLine();
                String[] splitedLine = Line.split(",");
                data.add(splitedLine);
            }
            for (String[] line : data) {
                //System.out.println(line[0] + "|" + line[1] + "|" + line[2] + "|" + line[3]  + line[4] + "|" + line[5] + "|" + line[6] + "|" + line[7] + "|" + line[8]);
                System.out.println("Car Name :" + line[0] );
                System.out.println("MPG :" + line[1] );
                System.out.println("Cylinder :" + line[2] );
                System.out.println("Displacement :" + line[3]);
                System.out.println("Horsepower :" + line[4]);
                System.out.println("Weight :" + line[5]);
                System.out.println("Acceleration :" + line[6]);
                System.out.println("Model :" + line[7]);
                System.out.println("Origin :" + line[8]);
                System.out.println("===============================");
            }


        } catch (FileNotFoundException e) {
            System.out.println("File not found! ");
            e.printStackTrace();
        }
    }
}
