package Programs;

import Interfaces.OrderRepository;
import Structures.User;

/**
 * A class used to issue requests to a database handling orders for a POS System.
 */
public class OrderService implements OrderRepository {
    /**
     * update the status of an order in the system.
     * @return true if the update was successful.
     */
    @Override
    public boolean updateOrderStatus() {
        return false;
    }

    /**
     * query the database for a list of orders associated with a customer.
     * @param aUser the user whose orders we want to view.
     * @return a list of orders from the customer.
     */
    @Override
    public String getCustomerOrders(User aUser) {
        return null;
    }

    /**
     * query the database for a list of orders associated with a certain day.
     * @param aDate the date to find orders from
     * @return a list of orders from that date.
     */
    @Override
    public String getOrdersFromDate(String aDate) {
        return null;
    }

    /**
     * query the database for a list of orders within a certain time period
     * @param aDate the date to start on
     * @param daysInPeriod the number of days to list orders from the start
     * @return a list of those orders within the dates
     */
    @Override
    public String getOrdersWithinPeriod(String aDate, int daysInPeriod) {
        return null;
    }

}
