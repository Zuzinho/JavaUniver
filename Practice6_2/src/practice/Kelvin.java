package practice;

public class Kelvin implements Convertable{
    @Override
    public double convert(double temp) {
        return temp + 273;
    }
}
