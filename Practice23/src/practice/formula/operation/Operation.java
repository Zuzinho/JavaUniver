package practice.formula.operation;

import practice.formula.Evaluatable;
import practice.formula.operand.Const;
import practice.formula.operand.Operand;
import practice.formula.operand.Variable;

public abstract class Operation {
    protected Evaluatable firstOperand;
    protected Evaluatable secondOperand;

    public Operation(Evaluatable firstOperand,Evaluatable secondOperand){
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

}
