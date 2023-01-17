package Task7;


import java.util.LinkedList;
import java.lang.Math;

public class LinkedIntList {
    private class Node {
        public int data;
        public Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node front;
    private int size;

    public LinkedIntList() {
        front = null;
        size = 0;
    }

    public void add(int value) {
        if (front == null) {
            front = new Node(value, null);
        } else {
            Node current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(value, null);
        }
        size++;
    }

    public Node nodeAt(int index) {
        Node current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public void add(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            front = new Node(value, front);
        } else {
            Node current = nodeAt(index - 1);
            current.next = new Node(value, current.next);
        }
        size++;
    }

    public void removeAll(LinkedIntList target){
        Node originPrev = null;
        Node originPointer = front;
        Node targetPointer = target.front;

        while(originPointer != null && targetPointer != null){
            if(originPointer.data < targetPointer.data){
                originPrev = originPointer;
                originPointer = originPointer.next;
            }else if(originPointer.data == targetPointer.data){
                if(originPrev!=null){
                    originPrev.next = originPointer.next;
                }else{
                    front = originPointer.next;
                }

                originPointer = originPointer.next;



            }else{
                targetPointer = targetPointer.next;
            }
        }


    }

    public void print(){
        Node current = front;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }



    public void test(){
        this.add(1);
        this.add(3);
        this.add(5);
        this.add(5);
        this.add(5);
        this.add(5);
        this.add(7);

        LinkedIntList l = new LinkedIntList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        this.print();
        l.print();
        this.removeAll(l);
        this.print();
    }


}
