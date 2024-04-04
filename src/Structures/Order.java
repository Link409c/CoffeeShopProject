package Structures;

import Interfaces.RepositoryInterface;

import java.util.ArrayList;

/**
 * an object representing an order placed by a user of a businesses' POS System through a Web App.
 */
public class Order implements RepositoryInterface<Order>{
    @Override
    public boolean addItem(Order order) {
        return false;
    }

    @Override
    public String getDetails(Order order) {
        return null;
    }

    @Override
    public void updateItem(Order order) {

    }
    @Override
    public boolean deleteItem(Order order) {
        return false;
    }

    private String customerID;
    private ArrayList<Item> items;
    private int numItems;
    private double totalCost;
    private OrderStatus status;
    private String datePlaced;

}
