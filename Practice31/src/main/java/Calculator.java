public class Calculator {
    public double plus(double a,double b){ return a + b; }
    public double minus(double a,double b){ return a - b; }
    public double multi(double a,double b){ return a * b; }
    public double divide(double a,double b){
        if(b == 0) throw new IllegalArgumentException();
        return a / b;
    }
    public double mod(double a, double b){
        if(b == 0) throw new IllegalArgumentException();
        return a % b;
    }
}
