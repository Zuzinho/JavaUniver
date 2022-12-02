package practice1;

public class Book {
    private String _name;
    private String _author;
    private int _pagesCount;
    public Book(String name,String author,int pagesCount){
        _name = name;
        _author = author;
        _pagesCount = pagesCount;
    }
    public String toString(){
        return "Book`s name is " + _name + ", author is " + _author+ ", " + _pagesCount + " pages";
    }
}
