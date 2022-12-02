package practice.orders;

import practice.items.Item;

public interface Order {
    public boolean add(Item item);
    public boolean remove(String name);
    public int removeAll(String name);
    public int size();
    public Item[] getItems();
    public int getFullPrice();
    public int getItemCount(String name);
    public Item[] getItemsUnique();
    public Item[] getSortItems();
}
