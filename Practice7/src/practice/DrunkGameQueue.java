package practice;

import java.util.*;

public class DrunkGameQueue extends DrunkGame{
    public DrunkGameQueue(){
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
