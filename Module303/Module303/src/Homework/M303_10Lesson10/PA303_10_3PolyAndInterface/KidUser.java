package Homework.M303_10Lesson10.PA303_10_3PolyAndInterface;

public class KidUser implements LibraryUser{

    int age;
    String bookType;

    public KidUser(int age) {
        this.age = age;
    }

    @Override
    public void registerAccount() {
        if (age < 11) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        }
    }

    @Override
    public void requestBook() {
        if ("kids".equalsIgnoreCase(bookType)) {
            System.out.println("Book issued successfully, please return the book within 10 days.");
        } else {
            System.out.println("Oops, you are allowed to the only kids book.");
        }
    }

    // Setter for bookType
    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}
