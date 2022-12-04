package practice;

import practice.customer.Address;
import practice.customer.Customer;
import practice.exception.IllegalAddress;
import practice.exception.IllegalTableNumber;
import practice.exception.OrderAlreadyAddedException;
import practice.file.File;
import practice.items.Dish;
import practice.items.drinks.Drink;
import practice.items.drinks.DrinkTypeEnum;
import practice.manager.InternetOrdersManager;
import practice.manager.RestaurantOrdersManager;
import practice.orders.InternetOrder;
import practice.orders.RestaurantOrder;

import java.io.IOException;

public class Tester {
    public static void main(String[] args) throws OrderAlreadyAddedException, IllegalAddress, IOException {
        File file = new File("C:\\Users\\user\\IdeaProjects\\Practice29\\File.txt");
        RestaurantOrdersManager restaurantOrdersManager = new RestaurantOrdersManager(50);
        InternetOrdersManager internetOrdersManager = new InternetOrdersManager();
        file.read(internetOrdersManager,restaurantOrdersManager);
        System.out.println("First internet");
        internetOrdersManager.printOrders();
        System.out.println("First restaurant");
        restaurantOrdersManager.printOrders();
        test(restaurantOrdersManager,internetOrdersManager);
        file.write(internetOrdersManager);
        file.write(restaurantOrdersManager);
    }
    public static void test(RestaurantOrdersManager restaurantOrdersManager,InternetOrdersManager internetOrdersManager) throws OrderAlreadyAddedException, IllegalAddress {
        RestaurantOrder restaurantOrder = new RestaurantOrder(5);
        restaurantOrder.add(new Drink(30,"Juice","Apple juice", DrinkTypeEnum.JUICE));
        restaurantOrder.add(new Dish(100,"Salad","Vegetable salad"));
        restaurantOrdersManager.addOrder("5",restaurantOrder);
        restaurantOrdersManager.addItem("5",new Drink(60,"Cola","Coca cola",DrinkTypeEnum.SODA));

        InternetOrder internetOrder = new InternetOrder(new Customer("Nik","Nik",20,
                new Address("Pushkin",12,"Pushkin",1,'p',12)));
        internetOrder.add(new Drink(30,"Whisky","Jack Daniels", DrinkTypeEnum.WHISKEY,0.4));
        internetOrder.add(new Dish(100,"Salad","Vegetable salad"));
        internetOrdersManager.addOrder("Pushkin",internetOrder);
        internetOrdersManager.addItem("Pushkin",new Drink(60,"Cola","Coca cola",DrinkTypeEnum.SODA));
        internetOrdersManager.removeOrder("Pushkin");
        internetOrdersManager.addOrder("Pushkin",internetOrder);

        System.out.println("Second restaurant");
        restaurantOrdersManager.printOrders();
        System.out.println("Second internet");
        internetOrdersManager.printOrders();
    }
}
