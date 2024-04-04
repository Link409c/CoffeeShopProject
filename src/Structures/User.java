package Structures;

import Interfaces.RepositoryInterface;

import java.util.ArrayList;

/**
 * Represents a regular user of the Web Application.
 */
public class User implements RepositoryInterface<User>{
    /**
     * Add a new User to the system.
     * @param user the User object to add
     * @return true if the user is successfully added to the database.
     */
    @Override
    public boolean addItem(User user) {
        return false;
    }

    /**
     * returns the non-secure user parameters.
     * @param user the user to display
     * @return the details displayed in the app
     */
    @Override
    public String getDetails(User user) {
        return null;
    }

    /**
     * update any of the user details.
     * @param user the user to update
     */
    @Override
    public void updateItem(User user) {

    }
    /**
     * remove a user from the system.
     * @param user the user to remove
     * @return true if the user is successfully removed from the database.
     */
    @Override
    public boolean deleteItem(User user) {
        return false;
    }
    private String userName;
    //TODO: implement hashing here to store password securely
    private String password;
    private String email;
    private ArrayList<MenuItem> favorites;
    private ArrayList<Order> previousOrders;
    //TODO: implement hashing here to securely store card info
    private ArrayList<String> payments;
}
