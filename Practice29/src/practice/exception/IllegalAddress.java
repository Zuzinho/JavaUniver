package practice.exception;

public class IllegalAddress extends Exception{
    public IllegalAddress(){
        super("No such address");
    }
}
