package practice.array;

public class MinMax<N extends Comparable> {
    private N[] array;

    public MinMax(N[] array) {
        this.array = array;
    }

    public N getMin(){
        if(array.length == 0) return null;
        N min = array[0];
        for(int i = 0;i<array.length;i++){
            if(min.compareTo(array[i]) > 0) min = array[i];
        }
        return min;
    }

    public N getMax(){
        if(array.length == 0) return null;
        N max = array[0];
        for(int i = 0;i<array.length;i++){
            if(max.compareTo(array[i]) < 0) max = array[i];
        }
        return max;
    }
}
