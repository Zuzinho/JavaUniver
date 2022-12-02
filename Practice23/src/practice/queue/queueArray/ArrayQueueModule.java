package practice.queue.queueArray;

public class ArrayQueueModule {
    private static Object[] elements = new Object[2];
    private static int front = -1, rear = -1;

    public static void enqueue(Object element){
        if(isFull()){
            elements = increaseArray();
            enqueue(element);
        }
        rear = (rear+1)%elements.length;
        if(front == -1) front = rear;
        elements[rear] = element;
    }

    public static Object element(){
        return elements[front];
    }

    public static Object dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        Object element = elements[front];
        front = (front+1)% elements.length;
        return element;
    }

    public static int size(){
        if(rear >= front) return rear - front + 1;
        return (rear + elements.length) - front + 1;
    }

    public static boolean isEmpty(){
        return front == -1;
    }

    public static boolean isFull(){
        if(rear == front - 1) return true;
        return front == 0 && rear == elements.length - 1;
    }

    public static void clear(){
        elements = new Object[2];
        front = -1;
        rear = -1;
    }

    public static Object[] getElements(){
        return elements;
    }

    private static Object[] increaseArray(){
        Object[] temp = new Object[elements.length * 2];
        int i = 0;
        while(front != rear){
            temp[i++] = elements[front++];
            if (front == elements.length) front = 0;
        }
        elements[i] = elements[front];
        front = 0;
        rear = elements.length - 1;
        return temp;
    }

}
