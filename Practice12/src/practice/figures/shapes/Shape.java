package practice.figures.shapes;

import java.awt.*;
import java.util.Random;

public abstract class Shape {
    protected Random rd = new Random();
    public Color color;
    public int[] arrayX;
    public int[] arrayY;

    public int corners;

    public Shape(int r,int g,int b){
        color = new Color(r,g,b);
    }

    public void setForm(int x,int y) {
        arrayX = new int[corners];
        arrayY = new int[corners];
        for(int i = 0;i<corners;i++){
            arrayX[i] = 50 +  x*200 + rd.nextInt(150);
            arrayY[i] = 50 +  y*200 + rd.nextInt(150);
        }
    }

    @Override
    public String toString() {
        String result = "Coordinates: ";
        for(int i = 0;i<corners;i++){
            result += String.format("(%1$s;%2$s)",arrayX[i],arrayY[i]);
        }
        return result;
    }
}
