package practice.manager;

import practice.exception.IllegalAddress;
import practice.exception.IllegalTableNumber;
import practice.exception.OrderAlreadyAddedException;
import practice.items.Item;
import practice.orders.InternetOrder;
import practice.orders.Order;
import practice.orders.RestaurantOrder;

import java.util.HashMap;
import java.util.Map;

public class RestaurantOrdersManager implements OrdersManager{
    private final HashMap<Integer, Order> restaurantOrders;
    private final int tableCount;

    public RestaurantOrdersManager(int tableCount){
        restaurantOrders = new HashMap<>();
        this.tableCount = tableCount;
    }

    @Override
    public void addOrder(String address,Order order) throws OrderAlreadyAddedException {
        int tableNumber = Integer.parseInt(address);
        if(restaurantOrders.get(tableNumber) == order) throw new OrderAlreadyAddedException();
        restaurantOrders.put(tableNumber,order);
    }

    @Override
    public Order getOrder(String address) throws IllegalAddress {
        int tableNumber = Integer.parseInt(address);
        Order order = restaurantOrders.get(tableNumber);
        if(order == null) throw new IllegalAddress();
        return order;
    }

    @Override
    public Order removeOrder(String address) throws IllegalAddress {
        int tableNumber = Integer.parseInt(address);
        Order order = restaurantOrders.remove(tableNumber);
        if(order == null) throw new IllegalAddress();
        return order;
    }

    @Override
    public void addItem(String address, Item item) throws IllegalAddress {
        int tableNumber = Integer.parseInt(address);
        Order order = restaurantOrders.remove(tableNumber);
        if(order == null) throw new IllegalAddress();
        Order copyOrder = new RestaurantOrder(tableNumber,order.getItems());
        copyOrder.add(item);
        restaurantOrders.put(tableNumber,copyOrder);
    }

    public int getFreeTableNumber(){
        int freeTableNumber = 1;
        while(restaurantOrders.containsKey(freeTableNumber)){
            freeTableNumber++;
        }
        if(freeTableNumber > tableCount) return -1;
        return freeTableNumber;
    }

    public int[] getFreeTableNumbers(){
        int[] numbers = new int[tableCount - restaurantOrders.size()];
        int i = 0;
        for(int number = 0;number < tableCount;number++){
            if(restaurantOrders.containsKey(number+1)) numbers[i++] = number;
        }
        return numbers;
    }

    public int remove(Order order){
        int removedTable = -1;
        for (Map.Entry<Integer,Order> pair: restaurantOrders.entrySet()){
            if(pair.getValue() == order) {
                removedTable = pair.getKey();
                break;
            }
        }
        if(removedTable > -1) restaurantOrders.remove(removedTable);
        return removedTable;
    }

    public int removeAll(Order order){
        int count = 0;
        while(remove(order) != -1) count++;
        return count;
    }


    @Override
    public Order[] getOrders(){
        Order[] orders = new Order[restaurantOrders.size()];
        int i = 0;
        for(Order order: restaurantOrders.values()) orders[i++] = order;
        return orders;
    }

    @Override
    public int getFullPrices(){
        int fullPrices = 0;
        for(Order order: restaurantOrders.values()) fullPrices += order.getFullPrice();
        return fullPrices;
    }

    @Override
    public int getItemFullCount() {
        return restaurantOrders.size();
    }

    @Override
    public int getItemFullCount(String name){
        int count = 0;
        for(Order order: restaurantOrders.values()) count += order.getItemCount(name);
        return count;
    }

    @Override
    public int getItemFullCount(Item item) {
        int count = 0;
        for(Order order: restaurantOrders.values()) count += order.getItemCount(item);
        return count;
    }

    @Override
    public void printOrders() {
        for(Order order: restaurantOrders.values()) order.printItems();
    }
}
