package Structures;

import Interfaces.InventoryRepository;
import Interfaces.RepositoryInterface;

public class Item implements RepositoryInterface<Item>, InventoryRepository {
    private String name;
    private int quantity;
}
