package practice;

import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collector;


public abstract class DrunkGame {
    protected Scanner sc = new Scanner(System.in);
    protected Collection<Integer> firstP,secondP;

    public void fillPlayers(){
        System.out.println("Enter cards number for 1 player: ");
        fillColl(firstP);
        System.out.println("Enter cards number for 2 player: ");
        fillColl(secondP);
    }

    public void play(){
        int moveCount = 0,firstStackLen = firstP.size(),secondStackLen = secondP.size();
        while(firstStackLen * secondStackLen > 0) {
            if (moveCount == 106) {
                System.out.println("botva");
                return;
            }
            moveCount++;
            int first = getFirstCard(firstP), second = getFirstCard(secondP);
            if ((first > second && second != 0 && first != 9) || (first == 0 && second == 9)) {
                moveWin(firstP, secondP);
                firstStackLen++;
                secondStackLen--;
                continue;
            }
            moveWin(secondP, firstP);
            secondStackLen++;
            firstStackLen--;
        }
        if(firstStackLen == 0) System.out.print("second ");
        else System.out.print("first ");
        System.out.print(moveCount);
    }
    private void fillColl(Collection<Integer> coll){
        for(int i =0;i<5;){
            if(sc.hasNextInt()){
                coll.add(sc.nextInt());
                i++;
            }
            else{
                System.out.println("Error,enter integer number");
                sc.next();
            }
        }
    }
    private void moveWin(Collection<Integer> winner,Collection<Integer> loser){
        winner.add(removeFirstCard(winner));
        winner.add(removeFirstCard(loser));
    }

    public abstract int getFirstCard(Collection<Integer> coll);
    public abstract int removeFirstCard(Collection<Integer> coll);
}
