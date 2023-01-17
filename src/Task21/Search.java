package Task21;


import java.sql.Array;
import java.util.ArrayList;

public class Search{

    public void test(){
        int x = 123;
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(123);

        System.out.println(linearSearch(x,al));
    }

    public static <T extends Comparable<T>> int linearSearch(T value, ArrayList<T> array){
        for(int i=0;i<array.size();i++){
            if(array.get(i).compareTo(value)==0){
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchLink(Comparable value, Comparable[] array){
        for(int i=0;i<array.length;i++){
            if(array[i].compareTo(value)==0){
                return i;
            }
        }
        return -1;
    }

}