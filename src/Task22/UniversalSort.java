package Task22;

public class UniversalSort {

    public static <T extends Comparable<T>> void bubbleSort(T[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i].compareTo(array[j])>0){
                    T buf = array[i];
                    array[i] = array[j];
                    array[j] = buf;
                }
            }
        }
    }

    public static <T extends Comparable<T>> void selectionSort(T[] array){
        for(int i=0;i<array.length;i++){
            int min = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j].compareTo(array[min])<0){
                    min = j;
                }
            }
            T buf = array[i];
            array[i] = array[min];
            array[min] = buf;
        }
    }
}
