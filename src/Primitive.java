import java.util.ArrayList;

public class Primitive<T extends Comparable<T>> {
    private ArrayList<T> arr;

    public Primitive() {
        arr = new ArrayList<>();
    }

    public void add(T value) {
        arr.add(value);
    }

    public void sort() {
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i).compareTo(arr.get(j)) > 0) {
                    T temp = arr.get(i);
                    T temp1 = arr.get(j);
                    arr.set(i, temp1);
                    arr.set(j, temp);
                }
            }
        }
    }

    public void printArr() {
        for(T value : arr) {
            System.out.println(value);
        }
    }

    public T max() {
        T maximum = arr.get(0);
        for(T value : arr) {
            maximum = (maximum.compareTo(value) < 0) ? value : maximum;
        }
        return maximum;
    }
}
