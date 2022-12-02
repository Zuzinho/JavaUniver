package practice.manager;

import practice.exception.OrderAlreadyAddedException;
import practice.items.Item;
import practice.orders.Order;

import java.util.HashMap;

public class OrderManager {
    private HashMap<String, Order> orders = new HashMap<>();

    public void addOrder(String address,Order order) throws OrderAlreadyAddedException {
        if(orders.get(address) != null) throw new OrderAlreadyAddedException();
        orders.put(address,order);
    }

    public Order getOrder(String address){
        return orders.get(address);
    }

    public Order removeOrder(String address){
        return orders.remove(address);
    }

    public void addItem(String address, Item item){
        Order order = orders.remove(address);
        if(order == null) return;
        order.add(item);
        orders.put(address,order);
    }

    public Order[] getOrders(){
        Order[] orders = new Order[this.orders.size()];
        int i = 0;
        for(Order order: this.orders.values()) orders[i++] = order;
        return orders;
    }

    public int getFullPrices(){
        int fullPrices = 0;
        for(Order order: this.orders.values()) fullPrices += order.getFullPrice();
        return fullPrices;
    }

    public int getItemFullCount(String name){
        int count = 0;
        for(Order order: this.orders.values()) count += order.getItemCount(name);
        return count;
    }
}
