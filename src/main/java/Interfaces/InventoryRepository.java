package Interfaces;

import Structures.Item;

/**
 * An interface designed to outline methods of interaction with a database for Inventory Management.
 */
public interface InventoryRepository {
    //update the quantity of an item
    boolean updateQty(Item anItem);
    //check if an item is available (quantity > 0)
    boolean isAvailable(Item anItem);
}
