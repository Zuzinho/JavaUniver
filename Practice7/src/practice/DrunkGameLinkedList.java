package practice;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.LinkedList;

public class DrunkGameLinkedList extends DrunkGame{
    public DrunkGameLinkedList(){
        this.firstP = new LinkedList<>();
        this.secondP = new LinkedList<>();
    }

    @Override
    public int getFirstCard(Collection<Integer> coll) {
        return ((LinkedList<Integer>)coll).get(0);
    }

    @Override
    public int removeFirstCard(Collection<Integer> coll) {
        return ((LinkedList<Integer>)coll).remove(0);
    }
}
