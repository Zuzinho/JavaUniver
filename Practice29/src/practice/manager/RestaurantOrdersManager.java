package practice.manager;

import practice.exception.IllegalTableNumber;
import practice.exception.OrderAlreadyAddedException;
import practice.items.Item;
import practice.orders.Order;

import java.util.HashMap;
import java.util.Map;

public class RestaurantOrdersManager implements OrdersManager{
    private HashMap<Integer, Order> restaurantOrders;
    private int tableCount;

    public RestaurantOrdersManager(int tableCount){
        restaurantOrders = new HashMap<>();
        this.tableCount = tableCount;
    }

    public void addOrder(int tableNumber,Order order) throws OrderAlreadyAddedException, IllegalTableNumber {
        if(tableNumber > tableCount) throw new IllegalTableNumber();
        if(restaurantOrders.get(tableNumber) == order) throw new OrderAlreadyAddedException();
        restaurantOrders.put(tableNumber,order);
    }

    public Order getOrder(int tableNumber) throws IllegalTableNumber {
        if(tableNumber > tableCount) throw new IllegalTableNumber();
        return restaurantOrders.get(tableNumber);
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

    public Order removeOrder(int tableNumber) throws IllegalTableNumber {
        if(tableNumber > tableCount) throw new IllegalTableNumber();
        return restaurantOrders.remove(tableNumber);
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

    public void addItem(int tableNumber, Item item) throws IllegalTableNumber {
        if(tableNumber > tableCount) throw new IllegalTableNumber();
        Order order = restaurantOrders.remove(tableNumber);
        if(order == null) return;
        order.add(item);
        restaurantOrders.put(tableNumber,order);
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
        for(Order order: restaurantOrders.values()) System.out.println(order);
    }
}
