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
        //try to connect to the database
            //if established,
                //call the database function to get the users table
                //add the passed parameter as a new entity
                //close the connection
                //return true
        //catch a bad connection exception
            //display an error on the UI
            //log the bad connection
        return false;
    }

    /**
     * returns the non-secure user parameters.
     * @param user the user to display
     * @return the details displayed in the app
     */
    @Override
    public String getDetails(User user) {
        //try to connect to the database
            //if established,
                //call the database function to get the users table
                    //if the passed user entity is in the table,
                        //get the non-secure details as a string to return
                        //then close the connection.
                    //else,
                        //string to return is error message.
        //catch a bad connection exception
            //log the bad connection
            //string to return is error message
        return null;
    }

    /**
     * update any of the user details.
     * @param user the user to update
     */
    @Override
    public boolean updateItem(User user) {
        //try to connect to the database
            //if established,
                //call the database function to get the users table
                    //if the passed user entity is in the table,
                        //check each parameter and change the ones that are different.
                        //then close the connection.
                        //return true
                    //else,
                        //close the connection.
        //catch a bad connection exception
            //display an error on the UI
            //log the bad connection
        return false;
    }
    /**
     * remove a user from the system.
     * @param user the user to remove
     * @return true if the user is successfully removed from the database.
     */
    @Override
    public boolean deleteItem(User user) {
        //try to connect to the database
            //if established,
                //call the database function to get the users table
                    //if the passed user entity is in the table,
                        //remove it
                        //then close the connection.
                        //return true
            //else,
                //display message that user is not in system.
                //close the connection.
        //catch a bad connection exception
            //display an error on the UI
            //log the bad connection
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
