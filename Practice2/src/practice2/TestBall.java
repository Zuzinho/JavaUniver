package practice2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball();
        Ball ball2 = new Ball(1.2,0.4);
        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
        ball2.setX(4.3);
        ball1.setXY(5,0.2);
        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
        ball1.move(0.32,7.4);
        System.out.println(ball1.toString());
    }
}
