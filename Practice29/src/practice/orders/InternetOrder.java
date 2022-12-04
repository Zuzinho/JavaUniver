package practice.orders;

import practice.closeLinkesList.CloseLinkedList;
import practice.customer.Customer;
import practice.items.Item;

import java.util.Arrays;
import java.util.HashSet;

public class InternetOrder implements Order{

    CloseLinkedList order;
    Customer customer;

    public InternetOrder(){
        this.customer = Customer.MATURE_UNKNOWN_CUSTOMER;
        order = new CloseLinkedList(null);
    }
    public InternetOrder(Customer customer){
        this.customer = customer;
        this.order = new CloseLinkedList(null);
    }
    public InternetOrder(Item[] items){
        order = new CloseLinkedList(null);
        for(Item item: items) order.add(item);
    }
    @Override
    public boolean add(Item item) {
        return order.add(item);
    }

    @Override
    public boolean remove(String name) {
        return order.remove(name);
    }

    @Override
    public boolean remove(Item item) {
        return order.remove(item);
    }

    @Override
    public int removeAll(String name) {
        int count = 0;
        while(order.remove(name)) count++;
        return count;
    }

    @Override
    public int removeAll(Item item) {
        int count = 0;
        while(order.remove(item)) count++;
        return count;
    }

    @Override
    public int getItemCount() {
        return order.getSize();
    }

    @Override
    public Item[] getItems() {
        return order.getItems();
    }

    @Override
    public String[] getItemsName() {
        Item[] items = order.getItems();
        String[] itemsName = new String[items.length];
        int i = 0;
        for(Item item: items) itemsName[i++] = item.getName();
        return itemsName;
    }

    @Override
    public int getFullPrice() {
        int fullPrice = 0;
        for(Item item: order.getItems()) fullPrice += item.getPrice();
        return fullPrice;
    }

    @Override
    public int getItemCount(String name) {
        int count = 0;
        for(Item item: order.getItems()) if(item.getName().equals(name)) count++;
        return count;
    }

    @Override
    public int getItemCount(Item item) {
        int count = 0;
        for(Item _item: order.getItems()) if(_item == item) count++;
        return count;
    }

    @Override
    public Item[] getItemsUnique() {
        HashSet<Item> set = new HashSet<>(Arrays.stream(order.getItems()).toList());
        Item[] items = new Item[set.size()];
        int i = 0;
        for(Item item: set) items[i++] = item;
        return items;
    }

    @Override
    public Item[] getSortedItems() {
        Item[] items = order.getItems();
        for(int i = 0;i<items.length-1;i++){
            for(int j = i + 1;j<items.length;j++){
                if(items[i].getPrice() < items[j].getPrice()){
                    Item temp = items[i];
                    items[i] = items[j];
                    items[j] = temp;
                }
            }
        }
        return items;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void printItems() {
        System.out.println("Price " + getFullPrice());
        for(Item item: getItems()) System.out.println(item);
    }
}
