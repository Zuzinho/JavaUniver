package practice;

public class TestCircleArray {
    public static void main(String[] args) {
        Tester tester = new Tester(5);
        tester.print();
        System.out.printf("min: %1$s ; max: %2$s",tester.min(),tester.max());
        tester.sort();
        tester.print();
    }
}
