package Structures;
import jakarta.persistence.Entity;

/**
 * Class representing an entity in a relational database. Superclass for all objects to be
 * tracked using the Relational Database in our Coffee House POS System.
 */
@Entity
public class DatabaseEntity{
    public DatabaseEntity(){
        this.tableName = null;
    }
    public DatabaseEntity(String theTable){
        this.tableName = theTable;
    }
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    private String tableName;
}
