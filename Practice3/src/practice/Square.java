package practice;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

     public double getSide(){
        return length;
     }

    public void setWidth(double side) {
        width = side;
    }

    public void setLength(double side) {
        length = side;
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "Square`s sides are " + length + ", area is " + getArea() + ", perimeter is " + getPerimeter();
    }
}
