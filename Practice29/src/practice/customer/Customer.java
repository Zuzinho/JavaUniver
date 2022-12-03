package practice.customer;

public record Customer (String firstName, String secondName, int age, Address address){
    public final static Customer MATURE_UNKNOWN_CUSTOMER = new Customer("","",18,Address.EMPTY_ADDRESS);
    public final static Customer NOT_MATURE_UNKNOWN_CUSTOMER = new Customer("","",17,Address.EMPTY_ADDRESS);
}
