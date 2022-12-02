package practice.anyTypeArray;

public class AnyTypeArray<E> {
    private E[] array;

    public AnyTypeArray(E[] array){
        this.array = array;
    }

    public E[] getArray() {
        return array;
    }

    public void setArray(E[] array) {
        this.array = array;
    }

    public E getElement(int index){
        return array[index];
    }

    public void showArray(){
        for(E el: array) System.out.print(el + " ");
        System.out.println();
    }
}
