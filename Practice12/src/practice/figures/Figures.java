package practice.figures;

import practice.figures.shapes.Quadrilateral;
import practice.figures.shapes.Shape;
import practice.figures.shapes.Triangle;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Figures extends JFrame {

    Random rd = new Random();
    int index;

    public Figures(){
        super("20 figures");
        setSize(1000,1000);
        setDefaultCloseOperation(3);
        index = 0;
    }

    @Override
    public void paint(Graphics g) {
        for(;index<20;index++) {
            int red = rd.nextInt(255), green = rd.nextInt(255), blue = rd.nextInt(255);
            boolean isTriangle = rd.nextBoolean();
            Shape shape;

            if (isTriangle) shape = new Triangle(red, green, blue);
            else shape = new Quadrilateral(red, green, blue);
            shape.setForm(index/4, index%4);
            System.out.println(shape);

            Polygon polygon = new Polygon(shape.arrayX, shape.arrayY, shape.corners);
            g.setColor(shape.color);

            g.fillPolygon(polygon);
        }
    }
}
