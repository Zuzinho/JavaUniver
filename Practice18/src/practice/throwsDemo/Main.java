package practice.throwsDemo;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            new ThrowsDemo().getKey();
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException in program");
        }
    }
}
