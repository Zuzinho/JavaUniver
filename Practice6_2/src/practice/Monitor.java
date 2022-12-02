package practice;

import java.util.Scanner;

public class Monitor implements Inputable{
    private double width;
    private double length;
    private Scanner sc = new Scanner(System.in);

    public Monitor() {
        input();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void input() {
        System.out.print("Enter width and length of monitor: ");
        this.width = sc.nextDouble();
        this.length = sc.nextDouble();
    }

    @Override
    public String toString() {
        return String.format("Monitor:\nWidth: %1$s\nLength: %2$s\n",width,length);
    }
}
