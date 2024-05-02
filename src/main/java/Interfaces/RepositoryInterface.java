package Interfaces;

import Structures.DatabaseEntity;

import java.util.List;

/**
 * An interface designed to give CRUD functionality to Data Access Objects of database-connected systems.
 */
public interface RepositoryInterface {
    //create a new entry
    boolean addEntity(DatabaseEntity d);
    //return the details of an object
    List<DatabaseEntity> getDetails(DatabaseEntity d);
    //update the details of an object
    boolean updateEntity(DatabaseEntity d);
    //delete an object
    boolean deleteEntity(DatabaseEntity d);
}
