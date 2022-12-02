package practice.convert;

import java.util.ArrayList;
import java.util.Arrays;

public class Conversion<E> {
    private ArrayList<E> arrayList = new ArrayList<>();

    public Conversion(E[] array){
        arrayList.addAll(Arrays.asList(array));
    }

    public void add(E el){
        arrayList.add(el);
    }

    public ArrayList<E> getList(){
        return arrayList;
    }

    public void showList(){
        for(E el: arrayList) System.out.print(el + " ");
        System.out.println();
    }
}
