package practice.orders;

import practice.customer.Customer;
import practice.items.Item;

import java.util.Arrays;
import java.util.HashSet;

public class RestaurantOrder implements Order{

    Item[] order;
    int size;
    int capacity;
    Customer customer;

    public RestaurantOrder(){
        this.customer = Customer.MATURE_UNKNOWN_CUSTOMER;
        size = 0;
        capacity = 1;
        order = new Item[capacity];
    }
    public RestaurantOrder(Customer customer){
        this.customer = customer;
        size = 0;
        capacity = 1;
        order = new Item[capacity];
    }
    public RestaurantOrder(Item[] items){
        order = items;
        size = order.length;
        capacity = size;
    }
    @Override
    public boolean add(Item item) {
        if(item == null) return false;
        if(size == capacity){
            capacity *=2;
            Item[] temp = new Item[capacity];
            size = 0;
            for (Item _item: order) {
                if(_item != null) temp[size++] = _item;
            }
            order = temp;
        }
        order[size++] = item;
        return true;
    }

    @Override
    public boolean remove(String name) {
        for(int i = 0;i< order.length;i++){
            if(order[i].getName().equals(name)){
                order[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Item item) {
        for(int i = 0;i< order.length;i++){
            if(order[i] == item){
                size--;
                for(int j = i+1;j< order.length;j++){
                    order[j-1] = order[j];
                }
                return true;
            }
        }
        return false;
    }


    @Override
    public int removeAll(String name) {
        int count = 0;
        while(remove(name)) count++;
        return count;
    }

    @Override
    public int removeAll(Item item) {
        int count = 0;
        while(remove(item)) count++;
        return count;
    }

    @Override
    public int getItemCount() {
        return size;
    }

    @Override
    public Item[] getItems() {
        Item[] items = new Item[size];
        System.arraycopy(order, 0, items, 0, size);
        return items;
    }

    @Override
    public String[] getItemsName() {
        String[] itemsName = new String[size];
        for(int i = 0;i<size;i++) itemsName[i] = order[i].getName();
        return itemsName;
    }

    @Override
    public int getFullPrice() {
        int fullPrice = 0;
        for(int i = 0;i<size;i++) fullPrice += order[i].getPrice();
        return fullPrice;
    }

    @Override
    public int getItemCount(String name) {
        int count = 0;
        for(int i = 0;i<size;i++) if(order[i].getName().equals(name)) count++;
        return count;
    }

    @Override
    public int getItemCount(Item item) {
        int count = 0;
        for(int i = 0;i<size;i++) if(order[i] == item) count++;
        return count;
    }

    @Override
    public Item[] getItemsUnique() {
        Item[] items = new Item[size];
        System.arraycopy(order, 0, items, 0, size);
        HashSet<Item> set = new HashSet<>(Arrays.stream(items).toList());
        return set.toArray(new Item[0]);
    }

    @Override
    public Item[] getSortedItems() {
        Item[] items = order;
        for(int i = 0;i<size-1;i++){
            for(int j = i + 1;j<size;j++){
                if(items[i].getPrice() < items[j].getPrice()){
                    Item temp = items[i];
                    items[i] = items[j];
                    items[j] = temp;
                }
            }
        }
        return items;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void printItems() {
        System.out.println("Price " + getFullPrice());
        for(Item item: order) System.out.println(item);
    }
}
