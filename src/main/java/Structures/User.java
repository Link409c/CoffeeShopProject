package Structures;

//ORM using Hibernate
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.ArrayList;

/**
 * Represents a regular user of the Web Application.
 */
@Entity
@Table(name = "user")
public class User extends DatabaseEntity{

    @Id
    @Column(name = "ID", nullable = false)
    private int userID;
    @Column(name = "NAME", nullable = false)
    private String userName;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "email address")
    private String email;
    @Column(name = "favorites")
    private ArrayList<MenuItem> favorites;
    @Column(name = "past orders")
    private ArrayList<Order> previousOrders;
    //TODO: implement hashing here to securely store card info
    @Column(name = "saved payments")
    private ArrayList<String> payments;

    public User(int userID, String userName, String password, String email, ArrayList<MenuItem> favorites,
                ArrayList<Order> previousOrders, ArrayList<String> payments) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.favorites = favorites;
        this.previousOrders = previousOrders;
        this.payments = payments;
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

    public ArrayList<MenuItem> getFavorites() {
        return favorites;
    }

    public void setFavorites(ArrayList<MenuItem> favorites) {
        this.favorites = favorites;
    }

    public ArrayList<Order> getPreviousOrders() {
        return previousOrders;
    }

    public void setPreviousOrders(ArrayList<Order> previousOrders) {
        this.previousOrders = previousOrders;
    }

    public ArrayList<String> getPayments() {
        return payments;
    }

    public void setPayments(ArrayList<String> payments) {
        this.payments = payments;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String aPassword){
        this.password = aPassword;
    }

}
