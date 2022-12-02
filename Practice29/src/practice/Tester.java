package practice;

import practice.exception.OrderAlreadyAddedException;
import practice.items.Dish;
import practice.items.Drink;
import practice.manager.OrderManager;
import practice.orders.InternetOrder;
import practice.orders.Order;

public class Tester {
    public static void main(String[] args) throws OrderAlreadyAddedException {
        Order order = new InternetOrder();
        order.add(new Drink(30,"Juice","Apple juice"));
        order.add(new Dish(100,"Salad","Vegetable salad"));
        OrderManager manager = new OrderManager();
        manager.addOrder("Pushkina",order);
        System.out.println(manager.getFullPrices());
    }
}
