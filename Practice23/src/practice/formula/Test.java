package practice.formula;

import practice.formula.operation.*;
import practice.formula.operand.*;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Multiply xTwo = new Multiply(new Variable('x'),new Variable('x'));
        Multiply twoX = new Multiply(new Const(2),new Variable('x'));
        Subtract xTwoMinusTwoX = new Subtract(xTwo,twoX);
        Add expression = new Add(xTwoMinusTwoX,new Const(1));

        System.out.print("Enter value of x: ");
        double variable = scanner.nextDouble();
        System.out.println("x^2-2x+1 = " + expression.evaluate(variable));
    }
}
