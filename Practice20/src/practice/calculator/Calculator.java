package practice.calculator;

import javax.sound.midi.Soundbank;

public class Calculator {
    public static <N extends Number> N sum(N a,N b){
        if(a instanceof Integer)
            return (N) (Integer.valueOf(a.intValue() + b.intValue()));
        else if(a instanceof Double)
            return (N) (Double.valueOf(a.doubleValue() + b.doubleValue()));
        else if(a instanceof Float)
            return (N) (Float.valueOf(a.floatValue() + b.floatValue()));

        return null;
    }
    public static <N extends Number> N subtraction(N a,N b){
        if(a instanceof Integer)
            return (N) (Integer.valueOf(a.intValue() - b.intValue()));
        else if(a instanceof Double)
            return (N) (Double.valueOf(a.doubleValue() - b.doubleValue()));
        else if(a instanceof Float)
            return (N) (Float.valueOf(a.floatValue() - b.floatValue()));

        return null;
    }
    public static <N extends Number> N multiply(N a,N b){
        if(a instanceof Integer)
            return (N) (Integer.valueOf(a.intValue() * b.intValue()));
        else if(a instanceof Double)
            return (N) (Double.valueOf(a.doubleValue() * b.doubleValue()));
        else if(a instanceof Float)
            return (N) (Float.valueOf(a.floatValue() * b.floatValue()));

        return null;
    }
    public static <N extends Number> N divide(N a,N b){
        if(a instanceof Integer)
            return (N) (Integer.valueOf(a.intValue() / b.intValue()));
        else if(a instanceof Double)
            return (N) (Double.valueOf(a.doubleValue() / b.doubleValue()));
        else if(a instanceof Float)
            return (N) (Float.valueOf(a.floatValue() / b.floatValue()));

        return null;
    }

    public static void main(String[] args) {
        System.out.printf("5 + 6 = %1$s\n",sum(Integer.valueOf(5),Integer.valueOf(6)));
        System.out.printf("5.5 - 6.1 = %1$s\n",subtraction(5.5,6.1));
        System.out.printf("5.2 * 7.2 = %1$s\n",multiply(5.2f,7.2f));
    }
}
