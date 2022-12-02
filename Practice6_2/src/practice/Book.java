package practice;

public class Book implements Printable{
    private String author;
    private String name;

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }

    @Override
    public void print() {
        System.out.printf("Author`s name: %1$s; Book`s name: %2$s%n",author,name);
    }
}
