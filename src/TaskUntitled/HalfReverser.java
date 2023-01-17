package TaskUntitled;


import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class HalfReverser{

    public void test(){

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(8);
        q.add(7);
        q.add(2);
        q.add(9);
        q.add(18);
        q.add(12);
        q.add(0);

        halfReverse(q);
        System.out.println(q);


    }

    public static void halfReverse(Queue<Integer> inQueue){
        Stack<Integer> stack = new Stack<>();
        int size = inQueue.size();
        for(int i=0;i<size;i++){
            if(i%2==0){
                inQueue.offer(inQueue.poll());
            }else {
                stack.push(inQueue.poll());
            }
        }

        while (stack.size()!=0){
            inQueue.offer(inQueue.poll());
            inQueue.offer(stack.pop());
        }
    }

}