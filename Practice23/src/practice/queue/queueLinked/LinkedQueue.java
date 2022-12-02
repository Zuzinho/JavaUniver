package practice.queue.queueLinked;


import practice.queue.AbstractQueue;

public class LinkedQueue extends AbstractQueue {
    private static class Node{
        Object value;
        Node next;

        Node(Object value){
            this.value = value;
            this.next = null;
        }
    }

    private int size = 0;
    private Node front,rear;

    public void enqueue(Object value){
        Node temp = new Node(value);
        if(size == 0){
            front = temp;
            rear = temp;
        }
        else{
            rear.next = new Node(value);
            rear = rear.next;
        }
        size++;
    }

    public Object element(){
        return front.value;
    }

    public Object dequeue(){
        if(size == 0){
            System.out.println("Queue is empty");
            return null;
        }
        Node element = front;
        front = front.next;
        size--;
        return element.value;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return rear.next == front;
    }

    public Object[] getElements(){
        Object[] elements = new Object[size];
        Node node = front;
        int i = 0;
        while(node != null){
            elements[i++] = node.value;
            node = node.next;
        }
        return elements;
    }

    public void clear(){
        size = 0;
        front = null;
        rear = null;
    }
}
