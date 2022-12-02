package practice;

public class Fahrenheit implements Convertable{
    @Override
    public double convert(double temp) {
        return temp*1.8 + 32;
    }
}
