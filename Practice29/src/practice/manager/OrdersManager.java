package practice.manager;

import practice.exception.IllegalAddress;
import practice.exception.IllegalTableNumber;
import practice.exception.OrderAlreadyAddedException;
import practice.items.Item;
import practice.orders.Order;

public interface OrdersManager {
    public void addOrder(String address,Order order) throws OrderAlreadyAddedException;

    public Order getOrder(String address) throws IllegalAddress;

    public Order removeOrder(String address) throws IllegalAddress;
    public void addItem(String address, Item item) throws IllegalAddress;
    public int getItemFullCount();
    public int getItemFullCount(String name);
    public int getItemFullCount(Item item);
    public Order[] getOrders();
    public int getFullPrices();
    public void printOrders();
}
