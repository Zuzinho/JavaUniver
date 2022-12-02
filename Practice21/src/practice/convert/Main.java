package practice.convert;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {52,12,85,-1};
        Conversion<Integer> conversionInt = new Conversion<>(integers);
        conversionInt.showList();

        String[] strings = {"one","two","three"};
        Conversion<String> conversionStr = new Conversion<>(strings);
        conversionStr.showList();
    }
}
