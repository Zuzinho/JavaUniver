package practice.exception;

public class OrderAlreadyAddedException extends Exception{
    public OrderAlreadyAddedException(){
        super("This order already added to this address");
    }
}
