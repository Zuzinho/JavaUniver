package practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IncorrectINNException {
        INN[] inns = {
                new INN("Nik","000000"),
                new INN("John","111111"),
                new INN("Kate","222222")
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name and inn: ");
        String userName = scanner.next();
        String userINN = scanner.next();

        for(INN inn: inns){
            if(inn.name.equals(userName)){
                if(inn.inn.equals(userINN)){
                    System.out.println("Success");
                    break;
                }
                else{
                    throw new IncorrectINNException("INN " + userINN + " is not user`s " + userName + " inn");
                }
            }
        }
    }
}
