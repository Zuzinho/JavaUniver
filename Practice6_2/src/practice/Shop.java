package practice;

public class Shop implements Printable{
    private String name;

    public Shop(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.printf("Shop`s name: %1$s%n",name);
    }
}
