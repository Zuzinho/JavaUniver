package practice.chair;

import java.util.Scanner;

public class TestChair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Chair chair;
        ChairFactory chairFactory = new ChairFactory();
        System.out.print("Enter type of chair: ");
        String type = scanner.next();
        switch (type.toLowerCase()){
            case("victorian")->{
                chair = chairFactory.createVictorianChair();
            }
            case("magic")->{
                chair = chairFactory.createMagicChair();
            }
            case("functional")->{
                chair = chairFactory.createFunctionalChair();
            }
        }
    }
}
