package practice;

public class Circle {
    public Point center;
    public double radius;
    public Circle(double x,double y,double radius){
        center = new Point(x,y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle`s coordinate (" + center.x + "," + center.y + "),radius " + radius;
    }
}
