package practice.closeLinkesList;

import practice.items.Item;

public class CloseLinkedList {
    private class Node{
        Node prev;
        Node next;
        Item item;
        Node(Item item){
            this.item = item;
            prev = null;
            next = null;
        }
    }
    private Node head;
    private int size;

    public CloseLinkedList(Item headItem){
        this.head = new Node(headItem);
        size = 0;
    }

    public boolean add(Item item){
        if(item == null) return false;
        Node newNode = new Node(item);
        size++;
        if(size == 0){
            newNode.next = head;
            newNode.prev = head;
            head = newNode;
            return true;
        }
        Node node = head;
        while(node.next != head) node = node.next;
        node.next = newNode;
        newNode.prev = node;
        newNode.next = head;
        return true;
    }

    public boolean remove(String name){
        Node node = head;
        int count = 0;
        while(node.item.getName().equals(name) || count++ != size) node = node.next;
        if(count == size) return false;
        Node nextNode = node.next;
        Node prevNode = node.prev;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        return true;
    }

    public int getSize(){
        return size;
    }

    public Item[] getItems(){
        Item[] items = new Item[size];
        int i = 0;
        Node node = head;
        while(i != size){
            items[i++] = node.item;
            node = node.next;
        }
        return items;
    }
}
