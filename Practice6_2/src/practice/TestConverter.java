package practice;


import java.util.Scanner;

public class TestConverter {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter temperature by celsius: ");
        double temp = sc.nextDouble();
        Convertable converter = new Fahrenheit();
        System.out.printf("Temperature by Celsius: %1$.2f%n",temp);
        System.out.printf("Temperature by Fahrenheit: %1$.2f%n",converter.convert(temp));
        converter = new Kelvin();
        System.out.printf("Temperature by Kelvin: %1$.2f%n",converter.convert(temp));
    }
}
