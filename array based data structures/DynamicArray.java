public class DynamicArray {
    int[] array;

    public DynamicArray(int capacity) {
        this.array = new int[capacity];
    }
    
    public void insert(int index, int element) {
        if (index > array.length - 1) {
            expand();
        }
        array[index] = element;
    }

    public int get(int index) {
        return array[index];
    }

    public void expand() {
        int[] newArray = new int[array.length * 2];

        int i;
        for(i = 0; i < array.length; i++) {
           newArray[i] = array[i];
        }

        array = newArray;
    }
}
