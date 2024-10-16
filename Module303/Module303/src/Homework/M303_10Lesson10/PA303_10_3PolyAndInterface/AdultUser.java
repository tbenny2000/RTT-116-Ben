package Homework.M303_10Lesson10.PA303_10_3PolyAndInterface;

public class AdultUser implements LibraryUser{

    int age; // Age of the user
    String bookType; // Type of book requested

    // Constructor
    public AdultUser(int age) {
        this.age = age;
    }

    @Override
    public void registerAccount() {
        if (age >= 12) {
            System.out.println("You have successfully registered under an Adult Account.");
        } else {
            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        }
    }

    @Override
    public void requestBook() {
        if ("Fiction".equalsIgnoreCase(bookType)) {
            System.out.println("Book issued successfully, please return the book within 7 days.");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books.");
        }
    }

    // Setter for bookType
    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}
