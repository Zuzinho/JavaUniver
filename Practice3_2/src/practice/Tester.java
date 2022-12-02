package practice;

import java.util.ArrayList;
import java.util.Random;

public class Tester {
    private Random rd;
    public ArrayList<Circle> circleArray;
    public int length;
    public Tester(int length){
        rd = new Random();
        this.length = length;
        circleArray = new ArrayList<>();
        for(int i = 0;i<length;i++){
            circleArray.add(new Circle(rd.nextDouble(),rd.nextDouble(),rd.nextDouble()));
        }
    }
    public Circle min(){
        Circle minCircle = new Circle(0,0,10000);
        for (Circle circle:circleArray) {
            if(minCircle.radius > circle.radius){
                minCircle = circle;
            }
        }
        return minCircle;
    }

    public Circle max(){
        Circle maxCircle = new Circle(0,0,0);
        for (Circle circle:circleArray) {
            if(maxCircle.radius < circle.radius){
                maxCircle = circle;
            }
        }
        return maxCircle;
    }

    public void sort(){
        for(int i = 0;i<length - 1;i++){
            for(int j = i+1;j<length;j++){
                Circle leftCircle = circleArray.get(i);
                Circle rightCircle = circleArray.get(j);
                if(leftCircle.radius > rightCircle.radius){
                    circleArray.set(i,rightCircle);
                    circleArray.set(j,leftCircle);
                }
            }
        }
    }
    public void print(){
        for(int i = 0;i<length;i++){
            System.out.println(circleArray.get(i));
        }
    }
}
