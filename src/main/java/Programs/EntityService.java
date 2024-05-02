package Programs;

import Interfaces.RepositoryInterface;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Structures.DatabaseEntity;

import java.util.List;

/**
 * Main superclass of all Data Access Objects in our POS System. Handles sessions and transactions.
 */
public class EntityService implements RepositoryInterface {
    /**
     * Add a new Entity to the system.
     * @param d the entity object to add
     * @return true if the entity is successfully added to the database.
     */
    public boolean addEntity(DatabaseEntity d) {
        Transaction transaction = getHibernateSession().beginTransaction();
        try {
            getHibernateSession().persist(d);
            transaction.commit();
        } catch(RuntimeException rte) {
            transaction.rollback();
            return false;
        }
        getHibernateSession().close();
        return true;
    }

    /**
     * returns a list of entities from a table. For use in entity-specific overloaded methods.
     * @param e the entity to display
     * @return the details displayed in the app
     */
    public List<DatabaseEntity> getDetails(DatabaseEntity e) {
        Transaction transaction = getHibernateSession().beginTransaction();
        List<DatabaseEntity> details;
        try {
            //get the table name from object name
            String tableName = e.getTableName();
            //make a list using the table entities
            details = getHibernateSession().createQuery("from " + tableName, DatabaseEntity.class).getResultList();
            transaction.commit();
        } catch(RuntimeException rte) {
            transaction.rollback();
            return null;
        }
        getHibernateSession().close();
        return details;
    }

    /**
     * update any of the Entity details.
     * @param e the entity to update
     * @return true if any details were updated successfully
     */
    public boolean updateEntity(DatabaseEntity e) {
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
    public boolean deleteEntity(DatabaseEntity e) {
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

    public Session getHibernateSession(){
        return this.hibernateSession;
    }

    public EntityService(Session theSession){
        this.hibernateSession = theSession;
    }

    private Session hibernateSession;
}
