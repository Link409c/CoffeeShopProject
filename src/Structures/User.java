package Structures;

import Interfaces.RepositoryInterface;
import Interfaces.UserRepository;

import java.util.ArrayList;

/**
 * Represents a regular user of the Web Application.
 */
public class User implements RepositoryInterface<User>, UserRepository {
    private String userName;
    //TODO: implement hashing here to store password securely
    private String password;
    private String email;
    private ArrayList<MenuItem> favorites;
    private ArrayList<Order> previousOrders;
    //TODO: implement hashing here to securely store card info
    private ArrayList<String> payments;
}
