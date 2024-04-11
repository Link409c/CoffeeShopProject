package Structures;

import java.util.ArrayList;

/**
 * Represents a regular user of the Web Application.
 */
public class User extends Entity<User>{

    private String userName;
    //TODO: implement hashing here to store password securely
    private String password;
    private String email;
    private ArrayList<MenuItem> favorites;
    private ArrayList<Order> previousOrders;
    //TODO: implement hashing here to securely store card info
    private ArrayList<String> payments;
}
