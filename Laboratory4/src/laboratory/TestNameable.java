package laboratory;

public class TestNameable {
    public static void main(String[] args) {
        Nameable nameable = new Car("Lada vesta");
        System.out.println(nameable.getName());
        nameable = new Planet("Earth");
        System.out.println(nameable.getName());
    }
}