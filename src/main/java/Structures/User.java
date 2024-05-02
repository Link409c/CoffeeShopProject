package Structures;

//ORM using Hibernate
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Represents a regular user of the Web Application.
 */
@Table (name = "user")
public class User extends DatabaseEntity{

    @Id
    @Column(name = "id", nullable = false)
    private int userID;
    @Column(name = "name", nullable = false)
    private String userName;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "custName")
    private String customerName;
    @Column(name = "email address")
    private String email;
    @Column(name = "phone")
    private String phoneNumber;

    public User(int userID, String userName, String password, String customerName, String email, String phone) {
        super("user");
        this.userID = userID;
        this.userName = userName;
        this.customerName = customerName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phone;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String aPassword){
        this.password = aPassword;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
