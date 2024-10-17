package org.perscholas;

import java.io.*;

public class Result {

    public static int getDigitsSum(int largeNumber) {
        int sum = 0;

        // Ensure we're working with a positive number
        largeNumber = Math.abs(largeNumber);

        while (largeNumber != 0) {
            int digit = largeNumber % 10; // Get the last digit
            sum += digit; // Add the digit to the sum
            // Remove the last digit using subtraction and multiplication
            largeNumber = (largeNumber - digit) / 10;
        }

        return sum;
    }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int largeNumber = Integer.parseInt(bufferedReader.readLine().trim());

            int result = Result.getDigitsSum(largeNumber);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
