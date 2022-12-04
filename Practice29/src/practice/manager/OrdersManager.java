package practice.manager;

import practice.items.Item;
import practice.orders.Order;

public interface OrdersManager {
    public int getItemFullCount();
    public int getItemFullCount(String name);
    public int getItemFullCount(Item item);
    public Order[] getOrders();
    public int getFullPrices();
    public void printOrders();
}
