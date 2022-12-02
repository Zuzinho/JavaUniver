package practice.queue.queueArray;

public class ArrayQueueADT{
    private Object[] elements = new Object[2];
    private int front = -1, rear = -1;

    public void enqueue(ArrayQueueADT arrayQueueADT,Object element){
        if(arrayQueueADT.isFull(arrayQueueADT)){
            arrayQueueADT.elements = increaseArray(arrayQueueADT);
            enqueue(arrayQueueADT,element);
        }
        arrayQueueADT.rear = (arrayQueueADT.rear+1)%arrayQueueADT.elements.length;
        if(arrayQueueADT.front == -1) arrayQueueADT.front = arrayQueueADT.rear;
        arrayQueueADT.elements[arrayQueueADT.rear] = element;
    }

    public Object element(ArrayQueueADT arrayQueueADT){
        return arrayQueueADT.elements[arrayQueueADT.front];
    }

    public Object dequeue(ArrayQueueADT arrayQueueADT){
        if(arrayQueueADT.isEmpty(arrayQueueADT)){
            System.out.println("Queue is empty");
            return null;
        }
        Object element = arrayQueueADT.elements[arrayQueueADT.front];
        arrayQueueADT.front = (arrayQueueADT.front+1)% arrayQueueADT.elements.length;
        return element;
    }

    public int size(ArrayQueueADT arrayQueueADT){
        if(arrayQueueADT.rear >= arrayQueueADT.front) return arrayQueueADT.rear - arrayQueueADT.front + 1;
        return (arrayQueueADT.rear + arrayQueueADT.elements.length) - arrayQueueADT.front + 1;
    }

    public boolean isEmpty(ArrayQueueADT arrayQueueADT){
        return arrayQueueADT.front == -1;
    }

    public boolean isFull(ArrayQueueADT arrayQueueADT){
        if(arrayQueueADT.rear == arrayQueueADT.front - 1) return true;
        return arrayQueueADT.front == 0 && arrayQueueADT.rear == arrayQueueADT.elements.length - 1;
    }

    public void clear(ArrayQueueADT arrayQueueADT){
        arrayQueueADT.elements = new Object[2];
        arrayQueueADT.front = -1;
        arrayQueueADT.rear = -1;
    }

    public Object[] getElements(ArrayQueueADT arrayQueueADT){
        return arrayQueueADT.elements;
    }

    private Object[] increaseArray(ArrayQueueADT arrayQueueADT){
        Object[] temp = new Object[arrayQueueADT.elements.length * 2];
        int i = 0;
        while(arrayQueueADT.front != arrayQueueADT.rear){
            temp[i++] = arrayQueueADT.elements[arrayQueueADT.front++];
            if (arrayQueueADT.front == arrayQueueADT.elements.length) arrayQueueADT.front = 0;
        }
        arrayQueueADT.elements[i] = arrayQueueADT.elements[arrayQueueADT.front];
        arrayQueueADT.front = 0;
        arrayQueueADT.rear = arrayQueueADT.elements.length - 1;
        return temp;
    }
}
