package practice.complex;

import java.util.Scanner;

public class TestComplex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values of complex number: ");
        ConcreteFactory concreteFactory = new ConcreteFactory();
        Complex complex = concreteFactory.CreateComplex(scanner.nextInt(),scanner.nextInt());
        System.out.println("Complex number: " + complex.getReal() + " + " + complex.getImage() + "i");
    }
}
