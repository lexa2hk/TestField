package Task6;

import java.util.*;

//hueta kakaya to

public class GuavaSorter {
    public static String[] guavaSort(String[] data){
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        for(String s : data){
            if(!hm.containsKey(s)){
                hm.put(s,1);
            }else{
                Integer buf = hm.get(s);
                buf++;
                hm.put(s,buf);

            }
        }
        return new String[]{"1", "b"};
    }
}
