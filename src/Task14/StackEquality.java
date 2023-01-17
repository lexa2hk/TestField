package Task14;

import java.util.Stack;

public class StackEquality {

    public void test(){
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s2.push(1);
        s2.push(2);
        s2.push(3);
        System.out.println(s1.equals(s2));
    }

    public static boolean equals(Stack s1, Stack s2){
        if(s1.size()!=s2.size()){
            return false;
        }
        for(int i=0;i<s1.size();i++){
            if(s1.get(i)!=s2.get(i)){
                return false;
            }
        }
        return true;
    }
}
