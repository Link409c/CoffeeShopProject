package Structures;


import jakarta.persistence.Column;

/**
 * A superclass representing an item in a POS system. Subclassed into Inventory and Menu items.
 */
public class Item extends DatabaseEntity{

    @Column(name = "name", nullable = false)
    private String name;

    public Item(String aName){
        this.name = aName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
