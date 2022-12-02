package practice;

import java.awt.*;
import java.util.Scanner;

public class Shell {
    private static Scanner sc = new Scanner(System.in);
    public static void exOne(){
        System.out.print("Enter number: ");
        Double doubleNumber = Double.valueOf(sc.nextDouble());
        System.out.print("\nDouble number: " + doubleNumber);
    }
    public static void exTwo(){
        System.out.print("Enter string you want to convert into double: ");
        try{
            Double doubleNumber = Double.parseDouble(sc.next());
            System.out.print("\nDouble number: " + doubleNumber);
        }
        catch (Exception e){
            System.out.println("Incorrect input");
        }
    }
    public static void exThree(){
        System.out.print("Enter number: ");
        Double number = sc.nextDouble();
        System.out.println("Double: " + number);
        System.out.println("Integer: " + number.intValue());
        System.out.println("Byte: " + number.byteValue());
        System.out.println("Short: " + number.shortValue());
        System.out.println("Long: " + number.longValue());
        System.out.println("Float: " + number.floatValue());
        System.out.print("String: " + number.toString());
    }
}
