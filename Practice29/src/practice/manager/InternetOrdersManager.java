package practice.manager;

import practice.exception.IllegalAddress;
import practice.exception.OrderAlreadyAddedException;
import practice.items.Item;
import practice.orders.InternetOrder;
import practice.orders.Order;

import java.util.HashMap;

public class InternetOrdersManager implements OrdersManager{
    private final HashMap<String, Order> internetOrders = new HashMap<>();

    @Override
    public void addOrder(String address,Order order) throws OrderAlreadyAddedException {
        if(internetOrders.get(address) == order) throw new OrderAlreadyAddedException();
        internetOrders.put(address,order);
    }

    @Override
    public Order getOrder(String address) throws IllegalAddress {
        Order order = internetOrders.get(address);
        if(order == null) throw new IllegalAddress();
        return order;
    }

    @Override
    public Order removeOrder(String address) throws IllegalAddress {
        Order order = internetOrders.remove(address);
        if(order == null) throw new IllegalAddress();
        return order;
    }

    @Override
    public void addItem(String address, Item item) throws IllegalAddress {
        InternetOrder order = (InternetOrder) internetOrders.remove(address);
        if(order == null) throw new IllegalAddress();
        InternetOrder copyOrder = new InternetOrder(order.getItems());
        copyOrder.setCustomer(order.getCustomer());
        copyOrder.add(item);
        internetOrders.put(address,copyOrder);
    }

    @Override
    public Order[] getOrders(){
        Order[] orders = new Order[internetOrders.size()];
        int i = 0;
        for(Order order: internetOrders.values()) orders[i++] = order;
        return orders;
    }

    @Override
    public int getFullPrices(){
        int fullPrices = 0;
        for(Order order: internetOrders.values()) fullPrices += order.getFullPrice();
        return fullPrices;
    }

    @Override
    public int getItemFullCount() {
        return internetOrders.size();
    }

    @Override
    public int getItemFullCount(String name){
        int count = 0;
        for(Order order: internetOrders.values()) count += order.getItemCount(name);
        return count;
    }

    @Override
    public int getItemFullCount(Item item) {
        int count = 0;
        for(Order order: internetOrders.values()) count += order.getItemCount(item);
        return count;
    }

    @Override
    public void printOrders() {
        for(Order order: internetOrders.values()) order.printItems();
    }
}