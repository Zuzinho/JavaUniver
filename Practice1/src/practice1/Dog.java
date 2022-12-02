package practice1;

public class Dog {
    private String name;
    private int age;
    public Dog(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return this.name + "`s age is " + this.age;
    }
}
