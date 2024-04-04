package Programs;

import Interfaces.InventoryRepository;
import Structures.Item;
/**
 * A class used to issue requests to a database handling items for a POS System. These may be inventory items,
 * menu items, etc.
 */
public class ItemService implements InventoryRepository {
    /**
     * change the quantity of an item in the database
     * @param anItem the item to update
     * @return true if the operation is successful.
     */
    @Override
    public boolean updateQty(Item anItem) {
        return false;
    }

    /**
     * check if an item is available (quantity greater than zero).
     * @param anItem the item to check
     * @return true if the item is available.
     */
    @Override
    public boolean isAvailable(Item anItem) {
        return false;
    }

}
