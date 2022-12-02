package practice.formula.operand;

import practice.formula.Evaluatable;

public class Const extends Operand {
    private double value;

    public Const(double value){ this.value = value; }

    @Override
    public double evaluate(double x) {
        return value;
    }
}
