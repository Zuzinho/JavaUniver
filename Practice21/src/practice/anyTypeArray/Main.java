package practice.anyTypeArray;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {5,3,-1};
        AnyTypeArray anyTypeArray = new AnyTypeArray<Integer>(integers);
        anyTypeArray.showArray();

        String[] strings = {"hello","world","!"};
        anyTypeArray = new AnyTypeArray<String>(strings);
        anyTypeArray.showArray();

        System.out.println(anyTypeArray.getElement(1));
    }
}
