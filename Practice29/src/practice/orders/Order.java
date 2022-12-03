package practice.orders;

import practice.customer.Customer;
import practice.items.Item;

public interface Order {
    public boolean add(Item item);
    public String[] getItemsName();
    public boolean remove(String name);
    public boolean remove(Item item);
    public int removeAll(String name);
    public int removeAll(Item item);
    public int getItemCount();
    public Item[] getItems();
    public int getFullPrice();
    public int getItemCount(String name);
    public int getItemCount(Item item);
    public Item[] getItemsUnique();
    public Item[] getSortedItems();
    public Customer getCustomer();
    public void setCustomer(Customer customer);
}
