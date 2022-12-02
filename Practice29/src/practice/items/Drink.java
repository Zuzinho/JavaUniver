package practice.items;

public final class Drink implements Item{
    private int price;
    private String name;
    private String description;

    public Drink(int price, String name, String description) {
        if(price < 0 | name.equals("") | description.equals("")) throw new IllegalArgumentException();
        this.price = price;
        this.name = name;
        this.description = description;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
