package practice;

import java.util.ArrayList;

public class TestPrintable {
    public static void main(String[] args) {
        ArrayList<Printable> arrayList = new ArrayList<>(){{
            add(new Book("John","Dragon"));
            add(new Shop("Metro"));
            add(new Book("Ricky","Dogs"));
        }};
        for (Printable printable: arrayList) printable.print();
    }
}
