package Structures;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.util.ArrayList;

/**
 * an object representing an order placed by a user of a businesses' POS System through a Web App.
 */
@Table (name = "order")
public class Order extends DatabaseEntity{

    @Id
    @Column(name = "id", nullable = false)
    private String orderID;
    @Column(name = "custID", nullable = false)
    private String customerID;
    private ArrayList<Item> items;
    @Column(name = "numItems", nullable = false)
    private int numItems;
    @Column(name = "totalCost", nullable = false)
    private double totalCost;
    @Column(name = "status", nullable = false)
    private OrderStatus status;
    @Column(name = "date", nullable = false)
    private String datePlaced;

}
