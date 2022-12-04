package practice;

import practice.exception.IllegalAddress;
import practice.exception.IllegalTableNumber;
import practice.exception.OrderAlreadyAddedException;
import practice.items.Dish;
import practice.items.drinks.Drink;
import practice.items.drinks.DrinkTypeEnum;
import practice.manager.InternetOrdersManager;
import practice.orders.InternetOrder;

public class Tester {
    public static void main(String[] args) throws OrderAlreadyAddedException, IllegalTableNumber, IllegalAddress {
        /*RestaurantOrder restaurantOrder = new RestaurantOrder();
        restaurantOrder.add(new Drink(30,"Juice","Apple juice", DrinkTypeEnum.JUICE));
        restaurantOrder.add(new Dish(100,"Salad","Vegetable salad"));
        RestaurantOrdersManager manager = new RestaurantOrdersManager(50);
        manager.addOrder(5,restaurantOrder);
        manager.addItem(5,new Drink(60,"Cola","Coca cola",DrinkTypeEnum.SODA));
        manager.removeOrder(5);
        manager.addOrder(5,restaurantOrder);*/
        InternetOrder internetOrder = new InternetOrder();
        internetOrder.add(new Drink(30,"Juice","Apple juice", DrinkTypeEnum.JUICE));
        internetOrder.add(new Dish(100,"Salad","Vegetable salad"));
        InternetOrdersManager manager = new InternetOrdersManager();
        manager.addOrder("Pushkina",internetOrder);
        manager.addItem("Pushkina",new Drink(60,"Cola","Coca cola",DrinkTypeEnum.SODA));
        manager.removeOrder("Pushkina");
        manager.addOrder("Pushkina",internetOrder);
        manager.printOrders();
    }
}
