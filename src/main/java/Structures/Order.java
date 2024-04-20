package Structures;

import jakarta.persistence.Id;

import java.util.ArrayList;

/**
 * an object representing an order placed by a user of a businesses' POS System through a Web App.
 */
public class Order extends DatabaseEntity{

    @Id
    private String orderID;
    private String customerID;
    private ArrayList<Item> items;
    private int numItems;
    private double totalCost;
    private OrderStatus status;
    private String datePlaced;

}
