package Interfaces;

import Structures.User;

/**
 * An interface designed to outline methods of interaction with a database for User and User Account Management.
 */
public interface UserRepository {
    //log in to the system with the given credentials
    void login(String aUserName, String aPassword);
    //log out of the system
    boolean logout();
    //authenticate credentials used for login or payment
    boolean authenticate(String credential);
    //authorize login or payment if authentication is successful
    boolean authorize();
}
