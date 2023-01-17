package Task9;

import java.util.HashSet;
import java.util.LinkedList;

public class LinkedIntlist extends LinkedList<Integer> {

    public void test(){
        this.add(1);
        this.add(3);
        this.add(5);
        this.add(7);
        this.add(7);
        this.add(7);
        this.add(7);

        this.removeDuplicates();
        System.out.println(this);
    }

    public void removeDuplicates(){
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<this.size();i++){
            if(!hs.contains(this.get(i))){
                hs.add(this.get(i));
            }else{
                this.remove(i);
                i--;
            }
        }
    }
}
