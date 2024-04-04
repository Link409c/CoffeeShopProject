package Interfaces;

import Structures.Order;
import Structures.User;

/**
 * An interface designed to outline methods of interaction with a database for Orders made through a POS System.
 */
public interface OrderRepository {
    //update the status of an order
    boolean updateOrderStatus();
    //get order history for a user
    String getCustomerHistory(User aUser);
    //get order history for a date
    String getOrdersFromDate(String aDate);
    //get order history for a set time period
    String getOrdersWithinPeriod(String aDate, int daysInPeriod);
}
