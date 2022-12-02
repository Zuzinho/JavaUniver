package practice;

public class MathFunc implements MathCalculable{
    @Override
    public double pow(double x, int pow) {
        double result = 1;
        for(int i =0;i<pow;i++){
            result*=x;
        }
        return result;
    }

    @Override
    public double complexAbs(double x, double y) {
        return Math.sqrt(x*x + y*y);
    }
    public double circleLen(double radius){
        return 2*PI*radius;
    }
}
