package Task4;

import java.util.HashSet;
import java.util.Set;

public class OddChecker {

    public void test(){
        var s = new HashSet<Integer>();
        s.add(1);
        s.add(2);
        s.add(3);

        System.out.println(hasOdd(s));
    }

    public static boolean hasOdd(Set<Integer> sData){
        var data= sData.toArray();
        for(int i=0;i<data.length;i++){
//            System.out.println(data[i]);
            if((Integer)data[i] %2!=0){
                return true;
            }

        }
        return false;
    }
}
