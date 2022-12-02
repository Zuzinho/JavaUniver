package practice;

public class TestMathFunc {
    public static void main(String[] args) {
        MathCalculable mathCalculable = new MathFunc();
        System.out.printf("5^2 = %1$s\n",mathCalculable.pow(5,2));
        System.out.printf("abs(5 - 2i) = %1$s\n",mathCalculable.complexAbs(5,2));
        MathFunc mathFunc = new MathFunc();
        System.out.printf("Length of circle with radius 6,2 = %1$s",mathFunc.circleLen(6.2));
    }
}
