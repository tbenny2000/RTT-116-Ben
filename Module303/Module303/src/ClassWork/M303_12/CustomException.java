package ClassWork.M303_12;

public class CustomException extends Exception {

    // when making a custom exception the naming practice is to always end with the word Exception
    // Making your onw custom exception
    // 1) extends Exception
    // 2) we creat a constructor that takes a string and calls supper to initialize the parent

    // *** One of th SBA question will you to create a custom exception.
    public CustomException(String message) {
        super(message);
    }
}
