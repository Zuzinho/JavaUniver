package practice;

import java.util.Collection;
import java.util.Stack;

public class DrunkGameStack extends DrunkGame{
    public DrunkGameStack() {
        this.firstP = new Stack<>();
        this.secondP = new Stack<>();
    }

    @Override
    public int getFirstCard(Collection<Integer> coll) {
        return ((Stack<Integer>)coll).get(0);
    }

    @Override
    public int removeFirstCard(Collection<Integer> coll) {
        return ((Stack<Integer>)coll).remove(0);
    }
}
