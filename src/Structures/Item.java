package Structures;

import Interfaces.InventoryRepository;
import Interfaces.RepositoryInterface;

/**
 * A superclass representing an item in a POS system. Subclassed into Inventory and Menu items.
 */
public class Item implements RepositoryInterface<Item>{
    /**
     * add a new item to the database.
     * @param item the item to add.
     * @return true if the operation is successful.
     */
    @Override
    public boolean addItem(Item item) {
        return false;
    }

    /**
     * display the details of an item in the web app.
     * @param item the item to display
     * @return a string consisting of the public parameters of the item.
     */
    @Override
    public String getDetails(Item item) {
        return null;
    }

    /**
     * update the parameters of an item.
     * @param item the item to update.
     */
    @Override
    public boolean updateItem(Item item) {
        return false;
    }
    /**
     * remove an item from the database.
     * @param item the item to remove.
     * @return true if the operation is successful.
     */
    @Override
    public boolean deleteItem(Item item) {
        return false;
    }

    private String name;
    private int quantity;

}
