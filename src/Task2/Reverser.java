package Task2;

import java.util.HashMap;

public class Reverser {

    public void test(){
        HashMap<Integer,String> dMap = new HashMap<Integer,String>();
        dMap.put(1, "one");
        dMap.put(2, "two");
        dMap.put(3, "three");

        HashMap<String,Integer> rMap = new HashMap<String,Integer>();
        rMap = reverse(dMap);

        System.out.println(rMap);
    }

    public static HashMap<String,Integer> reverse(HashMap<Integer,String> dMap){
        HashMap<String, Integer>  resMap = new HashMap<String, Integer>();
        for(Integer i : dMap.keySet()){
            resMap.put(dMap.get(i),i);
        }
        return resMap;
    }
}
