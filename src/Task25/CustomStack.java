package Task25;

public class CustomStack {
    private class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }

    }

    private Node head;
    private int size;

    public void push(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
    }

    public int pop(){
        if(head == null){
            throw new IllegalStateException();
        }
        int value = head.value;
        head = head.next;
        size--;
        return value;
    }

    public int peek(){
        if(head == null){
            throw new IllegalStateException();
        }
        return head.value;
    }

}