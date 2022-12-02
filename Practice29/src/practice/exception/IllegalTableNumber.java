package practice.exception;

public class IllegalTableNumber extends Exception{
    public IllegalTableNumber(){
        super("No such table number");
    }
}
