package practice.array;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {4,21,56};
        MinMax minMax = new MinMax(numbers);
        System.out.printf("Min - %1$s, Max - %2$s\n",minMax.getMin(),minMax.getMax());
    }
}
