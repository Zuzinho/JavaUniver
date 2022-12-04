import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTester {
    Calculator calculator = new Calculator();
    @Test
    public void testPlus(){
        double result = calculator.plus(3,4);
        Assertions.assertEquals(7,result);
    }
    @Test
    public void testMinus(){
        double result = calculator.minus(3,4);
        Assertions.assertEquals(-1,result);
    }
    @Test
    public void testMulti(){
        double result = calculator.multi(3,4);
        Assertions.assertEquals(12,result);
    }
    @Test
    public void testDivide(){
        try {
            double result = calculator.divide(3, 0);
            Assertions.assertEquals(0.75,result);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void testMod(){
        try {
            double result = calculator.mod(3, 4);
            Assertions.assertEquals(3,result);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
