package Structures;

import jakarta.persistence.Table;
import jakarta.persistence.Column;

/**
 * An object representing an inventory item tracked in a system. For example: Ingredients, Merchandise, etc.
 */
@Table(name = "inventory")
public class InventoryItem extends Item{

    @Column(name = "qty", nullable = false)
    private int quantity;

    public InventoryItem(String aName, int aQty) {
        super(aName);
        this.quantity = aQty;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
