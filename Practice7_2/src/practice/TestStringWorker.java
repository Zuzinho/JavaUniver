package practice;

public class TestStringWorker {
    public static void main(String[] args) {
        StringWorkable stringWorkable = new StringWorker();
        String example = "abshg";
        System.out.printf("symbolsCount(%2$s) = %1$s\n",stringWorkable.symbolsCount(example),example);
        System.out.printf("unevenString(%2$s) = %1$s\n",stringWorkable.unevenString(example),example);
        System.out.printf("invertString(%2$s) = %1$s",stringWorkable.invertString(example),example);
    }
}
