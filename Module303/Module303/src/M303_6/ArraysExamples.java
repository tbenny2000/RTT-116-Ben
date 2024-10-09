package M303_6;

public class ArraysExamples {
    public static void main(String[] args) {

        // this makes a new array of size 10 and all elements wil be 0
        int [] numbers = new int [10];

        // to initialize and array we can just loop over it and set ll value to something
        for (int pos = 0; pos < numbers.length; pos++) {
            numbers[pos] = 1;
            System.out.println("numbers[" + pos + "] = " + numbers[pos]);
        }

        // array by hard coding it
        // this will creat a new int array with size of 6
        // and automatically
        int [] numbers1 = {1, 2, 3, 4, 5, 6};


    }
}
