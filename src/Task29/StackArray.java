package Task29;

public class StackArray<T> {
    private T[] array;
    private int size;

    public StackArray(int capacity) {
        array = (T[]) new Object[capacity];
    }

    public void push(T value) {
        if (size == array.length) {
            throw new IllegalStateException();
        }
        array[size] = value;
        size++;
    }

    public T pop() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        T value = array[size - 1];
        array[size - 1] = null;
        size--;
        return value;
    }

    public T peek() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        return array[size - 1];
    }

    public boolean resize(int newCapacity){
        if(newCapacity < size){
            return false;
        }
        T[] newArray = (T[]) new Object[newCapacity];
        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        array = newArray;
        return true;
    }
}
