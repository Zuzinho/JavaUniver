package practice;

import java.util.ArrayDeque;
import java.util.Collection;

public class DrunkGameDeque extends DrunkGame{
    public DrunkGameDeque(){
        this.firstP = new ArrayDeque<>();
        this.secondP = new ArrayDeque<>();
    }

    @Override
    public int getFirstCard(Collection<Integer> coll) {
        return ((ArrayDeque<Integer>)coll).peek();
    }

    @Override
    public int removeFirstCard(Collection<Integer> coll) {
        return ((ArrayDeque<Integer>)coll).remove();
    }
}
