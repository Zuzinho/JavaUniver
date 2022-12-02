package practice.formula.operand;

import practice.formula.Evaluatable;

public class Variable extends Operand {
    public Variable(char symbol){
    }

    @Override
    public double evaluate(double x) {
        return x;
    }
}
