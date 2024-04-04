package Interfaces;

/**
 * An interface designed to give CRUD functionality to database-connected systems.
 * @param <E> the object to change, add, or remove from a table.
 */
public interface RepositoryInterface<E> {
    //create a new entry
    boolean addItem(E e);
    //return the details of an object
    String getDetails(E e);
    //update the details of an object
    void updateItem(E e);
    //delete an object
    boolean deleteItem(E e);
}
