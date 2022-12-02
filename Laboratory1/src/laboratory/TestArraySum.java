package laboratory;

public class TestArraySum {
    public static void main(String[] args) {
        int[] array = Array.InitArray();
        System.out.println("Array sum by 'for': " + Array.SumFor(array));
        System.out.println("Array sum by 'while': " + Array.SumWhile(array));
        System.out.println("Array sum by 'doWhile': " + Array.SumDoWhile(array));
    }
}
