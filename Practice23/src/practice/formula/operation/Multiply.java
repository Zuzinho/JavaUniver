package practice.formula.operation;

import practice.formula.Evaluatable;
import practice.formula.operand.Const;
import practice.formula.operand.Variable;

public class Multiply extends Operation implements Evaluatable {

    public Multiply(Evaluatable firstOperand, Evaluatable secondOperand) {
        super(firstOperand, secondOperand);
    }

    @Override
    public double evaluate(double x) {
        return firstOperand.evaluate(x) * secondOperand.evaluate(x);
    }
}
