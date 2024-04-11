package Interfaces;

/**
 * An interface designed to give CRUD functionality to entities of database-connected systems.
 * @param <E> the entity to change, add, or remove from a table.
 */
public interface RepositoryInterface<E> {
    //create a new entry
    boolean addEntity(E e);
    //return the details of an object
    String getDetails(E e);
    //update the details of an object
    boolean updateEntity(E e);
    //delete an object
    boolean deleteEntity(E e);
}
