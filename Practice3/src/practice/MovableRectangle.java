package practice;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1,int y1,int x2,int y2,int xSpeed,int ySpeed){
        this.topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        this.bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    @Override
    public void moveUp() {
        if(!isSameSpeed()) return;
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        if(!isSameSpeed()) return;
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        if(!isSameSpeed()) return;
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        if(!isSameSpeed()) return;
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "Прямоугольник с координатами (" + topLeft.x + ';' + topLeft.y + ") и (" + bottomRight.x + ';' + bottomRight.y + ") имеет скорость по x и y,равные " + topLeft.xSpeed + " и " + topLeft.ySpeed + "соотвественно";

    }

    private boolean isSameSpeed(){
        return (topLeft.xSpeed == bottomRight.xSpeed) && (topLeft.ySpeed == bottomRight.ySpeed);
    }
}
