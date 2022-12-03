package practice.items;

public class Item {
    protected final int price;
    protected final String name;
    protected final String description;

    public Item(int price, String name, String description) {
        if(price < 0 | name.equals("") | description.equals("")) throw new IllegalArgumentException();
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
