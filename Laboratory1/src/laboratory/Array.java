package laboratory;

import java.util.Scanner;

public class Array {
    private static Scanner sc = new Scanner(System.in);

    public static int[] InitArray(){
        System.out.println("Enter array`s lenght: ");
        int len = GetIntNumber();
        int[] array = new int[len];
        for(int i=0;i<len;i++){
            System.out.println("Enter number: ");
            array[i] = GetIntNumber();
        }
        sc.close();
        return array;
    }
    public static int SumFor(int[] array){
        int sum = 0;
        for (int i =0;i<array.length;i++) {
            sum+=array[i];
        }
        return sum;
    }
    public static int SumWhile(int[] array){
        int i=0,sum=0;
        while(i<array.length){
            sum+=array[i];
            i++;
        }
        return sum;
    }
    public static int SumDoWhile(int[] array){
        if(array.length == 0) return 0;
        int i=0,sum=0;
        do{
            sum+=array[i];
            i++;
        }
        while(i<array.length);
        return sum;
    }
    private static int GetIntNumber(){
        while(true){
            if(sc.hasNextInt()) {
                return sc.nextInt();
            }
            sc.next();
            System.out.println("Error! Enter integer number: ");
        }
    }
}
