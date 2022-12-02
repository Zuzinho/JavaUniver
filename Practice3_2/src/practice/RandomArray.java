package practice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Comparator;

public class RandomArray {
    private static Random rd = new Random();
    private static Scanner sc = new Scanner(System.in);

    private static ArrayList<Double> randomMethod(int len){
        ArrayList<Double> arrayDouble = new ArrayList<>();
        for(int i =0;i<len;i++){
            arrayDouble.add(Math.random());
        }
        return arrayDouble;
    }

    private static ArrayList<Double> randomClass(int len){
        ArrayList<Double> arrayDouble = new ArrayList<>();
        for(int i =0;i<len;i++){
            arrayDouble.add(rd.nextDouble());
        }
        return arrayDouble;
    }

    public static void printArray(ArrayList<Double> arrayDouble){
        for(double number: arrayDouble){
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void exOne(){
        ArrayList<Double> arrayDouble;
        arrayDouble = randomMethod(10);
        printArray(arrayDouble);
        arrayDouble.sort(Comparator.naturalOrder());
        printArray(arrayDouble);
        arrayDouble = randomClass(10);
        printArray(arrayDouble);
        arrayDouble.sort(Comparator.naturalOrder());
        printArray(arrayDouble);
    }

    public static void exThree(){
        ArrayList<Integer> array = new ArrayList<>(4);
        for(int i = 0;i<4;i++){
            int number = rd.nextInt(90) + 10;
            array.add(number);
            System.out.print(number + " ");
        }
        String result = "";
        for(int i =1;i<4;i++){
            if(array.get(i-1) > array.get(i)){
                result += "no ";
                break;
            }
        }
        System.out.println('\n' + result + "growing");
    }
    public static void exFour(){
        System.out.print("Enter length of array: ");
        int n;
        while(true){
            if(sc.hasNextInt()){
                n = sc.nextInt();
                if(n>0) break;
            }
            System.out.print("\nIncorrect number, try again: ");
        }
        ArrayList<Integer> arrayList = new ArrayList<>(n);
        System.out.print("First array: ");
        for(int i=0;i<n;i++){
            int number = rd.nextInt(n);
            arrayList.add(number);
            System.out.print(number + " ");
        }
        System.out.print("\nSecond array: ");
        for(int i =0;i<n;i++){
            int number = arrayList.get(i);
            if(number %2==0) System.out.print(number + " ");
        }
    }
}
