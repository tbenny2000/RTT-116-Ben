package coffe_shop;

public class InvalidInputException extends Exception {
    // 1) extends Exception
    // 2) create a constructor that takes a string and calls supper to initialize parent
    public InvalidInputException(String message) {
        super(message);
    }
}
