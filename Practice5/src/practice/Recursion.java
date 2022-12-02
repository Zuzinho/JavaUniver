package practice;

import java.util.Scanner;

public class Recursion {
    private static Scanner sc = new Scanner(System.in);

    public static int recursion10(int number,int result){
        result*=10;
        result += number%10;
        number/=10;
        if(number == 0) return result;
        return recursion10(number,result);
    }

    public static int recursion11(){
        int value = sc.nextInt();
        if(value == 0){
            int nextVal = sc.nextInt();
            if(nextVal == 0) return 0;
            if(nextVal == 1) return 1 + recursion11();
            return recursion11();
        }
        if(value == 1){
            return 1 + recursion11();
        }
        return recursion11();
    }

    public static void recursion12(){
        int value = sc.nextInt();
        if(value == 0) return;
        if(value % 2 == 1) System.out.println("Uneven number: " + value);
        recursion12();
    }

    public static void recursion13(){
        int value = sc.nextInt();
        if(value == 0) return;
        System.out.println("Uneven index number: " + value);
        sc.nextInt();
        recursion13();
    }

    public static void recursion14(int number){
        if(number == 0) return;
        int pow = (int) (Math.log10(number));
        int powNumber = (int) Math.pow(10,pow);
        int firstNumber = number / powNumber;
        System.out.print(firstNumber + " ");
        number %= powNumber;
        recursion14(number);
    }
}
