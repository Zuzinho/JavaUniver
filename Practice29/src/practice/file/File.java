package practice.file;

import practice.customer.Address;
import practice.customer.Customer;
import practice.exception.OrderAlreadyAddedException;
import practice.items.Dish;
import practice.items.Item;
import practice.items.drinks.Drink;
import practice.items.drinks.DrinkTypeEnum;
import practice.manager.InternetOrdersManager;
import practice.manager.OrdersManager;
import practice.manager.RestaurantOrdersManager;
import practice.orders.InternetOrder;
import practice.orders.Order;
import practice.orders.RestaurantOrder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class File {
    private String path;
    private Scanner scanner;
    public File(String path){
        this.path = path;
    }

    public void write(InternetOrdersManager manager) {
        try(FileWriter fileWriter = new FileWriter(path,true)) {
            for (Order order: manager.getOrders()){
                fileWriter.append("IO: ").append(String.valueOf(((InternetOrder) order).getCustomer().address())).append(String.valueOf('\n'));
                for(Item item: order.getItems()){
                    fileWriter.append(item.toString()).append(String.valueOf('\n'));
                }
            }
        }
        catch (IOException exception){
            System.out.println("File not opened");
        }
    }

    public void write(RestaurantOrdersManager manager) {
        try(FileWriter fileWriter = new FileWriter(path,true)) {
            for (Order order: manager.getOrders()){
                fileWriter.append("RO: ").append(String.valueOf(((RestaurantOrder)order).getTableNumber())).append(String.valueOf('\n'));
                for(Item item: order.getItems()){
                    fileWriter.append(item.toString()).append(String.valueOf('\n'));
                }
            }
        }
        catch (IOException exception){
            System.out.println("File not opened");
        }
    }

    public void read(InternetOrdersManager internetOrdersManager, RestaurantOrdersManager restaurantOrdersManager) throws IOException {
        try(FileReader fileReader = new FileReader(path)) {
            String address = "empty";
            Order order = null;
            OrdersManager currentOrdersManager = null;
            scanner = new Scanner(fileReader);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith("IO:")) {
                    if(!address.equals("empty")) {
                        currentOrdersManager.addOrder(address, order);
                    }
                    address = line.substring(4);
                    order = new InternetOrder();
                    currentOrdersManager = internetOrdersManager;
                    continue;
                }
                if (line.startsWith("RO:")) {
                    if(!address.equals("empty")) {
                        currentOrdersManager.addOrder(address, order);
                    }
                    address = line.substring(4);
                    order = new RestaurantOrder(Integer.parseInt(address));
                    currentOrdersManager = restaurantOrdersManager;
                    continue;
                }
                String[] params = line.split(",");
                if (params.length == 5) {
                    order.add(new Drink(Integer.parseInt(params[0]), params[1], params[2],
                            DrinkTypeEnum.valueOf(params[3]), Double.parseDouble(params[4])));
                } else {
                    order.add(new Dish(Integer.parseInt(params[0]), params[1], params[2]));
                }
            }
            if(!address.equals("empty")) {
                currentOrdersManager.addOrder(address, order);
            }
            cleanFile();
        }
        catch (IOException exception){
            System.out.println("File not opened");
        }
        catch (OrderAlreadyAddedException exception) {
            throw new RuntimeException(exception);
        }
        catch (NumberFormatException exception){
            System.out.println("Incorrect address input or item description");
        }
    }
    private void cleanFile() throws IOException {
        try(FileWriter fileWriter = new FileWriter(path)){
            fileWriter.write("");
        }
        catch (IOException exception){
            System.out.println("File not opened");
        }
    }
}
