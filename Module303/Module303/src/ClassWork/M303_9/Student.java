package ClassWork.M303_9;

public class Student {

    private int sudentId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public Student(int sudentId, String firstName, String lastName, String email, String phone) {
        this.sudentId = sudentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public int getSudentId() {
        return sudentId;
    }

    public void setSudentId(int sudentId) {
        this.sudentId = sudentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
