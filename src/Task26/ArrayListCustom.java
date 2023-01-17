package Task26;


import java.io.Serializable;

public class ArrayListCustom<T> implements Serializable, Cloneable{

    private class Node{
        T value;
        Node next;
        Node(T value){
            this.value = value;
        }
    }

    private Node head;
    private int size;

    public void add(T value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
    }

    public T get(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException();
        }
        Node current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.value;
    }

    public void set(int index, T value){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException();
        }
        Node current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        current.value = value;
    }

    public void remove(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException();
        }
        if(index == 0){
            head = head.next;
            size--;
            return;
        }
        Node current = head;
        for(int i = 0; i < index - 1; i++){
            current = current.next;
        }
        current.next = current.next.next;
        size--;
    }

    public int size(){
        return size;
    }

    public void print(){
        Node current = head;
        while(current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }


}
