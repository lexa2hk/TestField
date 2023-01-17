package Task11;

import java.util.LinkedList;

public class LinkedIntList {
    private class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private ListNode front;  // first value in the list
    private int size=0;

    public LinkedIntList() {
        front = null;
    }

    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
        size++;
    }



    public void moveFirstToEnd(){
        if(front==null){
            return;
        }
        ListNode current=front;
        while(current.next!=null){
            current=current.next;
        }
        current.next=front;
        front=front.next;
        current.next.next=null;
    }
}
