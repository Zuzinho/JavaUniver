package practice.items.drinks;

import practice.items.Item;

public final class Drink extends Item implements Alcoholable {
    private final double alcoholVol;
    private final DrinkTypeEnum type;

    public Drink(int price, String name, String description,DrinkTypeEnum type) {
        super(price,name,description);
        this.type = type;
        this.alcoholVol = 0;
    }

    public Drink(int price, String name, String description,DrinkTypeEnum type,double alcoholVol) {
        super(price, name, description);
        this.type = type;
        this.alcoholVol = alcoholVol;
    }

    public DrinkTypeEnum getType() {
        return type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return alcoholVol != 0;
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }

    @Override
    public String toString() {
        String result = super.toString();
        String alcoholable = alcoholVol == 0? ", not alcoholable": ", alcoholable";
        return result + alcoholable + String.format(", alcohol volume - %1$s",alcoholVol);

    }
}
