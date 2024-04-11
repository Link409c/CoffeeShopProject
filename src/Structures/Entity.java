package Structures;

import Interfaces.RepositoryInterface;
//import the hibernate library for database associated method calls

/**
 * Class representing an entity in a relational database. Superclass for all objects to be
 * tracked using the Relational Database in our Coffee House POS System.
 */
public class Entity<E> implements RepositoryInterface<E> {
    /**
     * Add a new Entity to the system.
     * @param e the entity object to add
     * @return true if the entity is successfully added to the database.
     */
    public boolean addEntity(E e) {
        //try to connect to the database
            //if established,
                //call the database method to get the associated table
                    //if entity already exists,
                        //display error on the UI
                        //close the connection
                    //else,
                        //add the passed parameter as a new entity
                        //close the connection
                        //return true
        //catch a bad connection exception
            //display an error on the UI
            //log the bad connection
        return false;
    }

    /**
     * returns the non-secure Entity parameters.
     * @param e the entity to display
     * @return the details displayed in the app
     */
    public String getDetails(E e) {
        //try to connect to the database
            //if established,
                //call the database method to get the associated table
                    //if the passed entity is in the table,
                        //get the non-secure details as a string to return
                    //else,
                        //string to return is error message.
                    //then close the connection.
        //catch a bad connection exception
            //log the bad connection
            //string to return is error message
        return null;
    }

    /**
     * update any of the Entity details.
     * @param e the entity to update
     * @return true if any details were updated successfully
     */
    public boolean updateEntity(E e) {
        //try to connect to the database
            //if established,
                //call the database method to get the associated table
                    //if the passed entity is in the table,
                        //check each parameter and change the ones that are different.
                        //close connection
                        //return true
                    //else,
                        //inform user no details changed.
                        //close the connection.
        //catch a bad connection exception
            //display an error on the UI
            //log the bad connection
        return false;
    }

    /**
     * remove an Entity from the system.
     * @param e the entity to remove
     * @return true if the entity is successfully removed from the database.
     */
    //notes
    /*
     * Need to account for cascading deletes and / or parent-child dependencies in
     * removing entities from the database
     */
    public boolean deleteEntity(E e) {
        //try to connect to the database
            //if established,
                //call the database method to get the associated table
                    //if the passed entity is in the table,
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

}
