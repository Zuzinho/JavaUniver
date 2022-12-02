package practice.orders;

import practice.closeLinkesList.CloseLinkedList;
import practice.items.Item;

import java.util.Arrays;
import java.util.HashSet;

public class InternetOrder implements Order{

    CloseLinkedList orders;

    public InternetOrder(){
        orders = new CloseLinkedList(null);
    }
    public InternetOrder(Item[] items){
        orders = new CloseLinkedList(null);
        for(Item item: items) orders.add(item);
    }

    @Override
    public boolean add(Item item) {
        return orders.add(item);
    }

    @Override
    public boolean remove(String name) {
        return orders.remove(name);
    }

    @Override
    public int removeAll(String name) {
        int count = 0;
        while(orders.remove(name)) count++;
        return count;
    }

    @Override
    public int size() {
        return orders.getSize();
    }

    @Override
    public Item[] getItems() {
        return orders.getItems();
    }

    @Override
    public int getFullPrice() {
        int fullPrice = 0;
        for(Item item: orders.getItems()) fullPrice += item.getPrice();
        return fullPrice;
    }

    @Override
    public int getItemCount(String name) {
        int count = 0;
        for(Item item: orders.getItems()) if(item.getName().equals(name)) count++;
        return count;
    }

    @Override
    public Item[] getItemsUnique() {
        HashSet<Item> set = new HashSet<>(Arrays.stream(orders.getItems()).toList());
        Item[] items = new Item[set.size()];
        int i = 0;
        for(Item item: set) items[i++] = item;
        return items;
    }

    @Override
    public Item[] getSortItems() {
        Item[] items = orders.getItems();
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
}
