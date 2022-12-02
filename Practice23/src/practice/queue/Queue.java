package practice.queue;

public interface Queue {
    public void enqueue(Object element);
    public Object element();
    public Object dequeue();
    public int size();
    public boolean isEmpty();
    public boolean isFull();
    public void clear();
}
