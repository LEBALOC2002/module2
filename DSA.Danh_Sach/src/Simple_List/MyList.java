package Simple_List;

import java.util.Arrays;

public class MyList<E> {
    private int Size = 0;

    private static final int DEFAULT_CAPACITY = 10;

    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Cài đặt phương thức ensureCapa()
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    // Cài đặt phương thức add()
    void add(E e) {
        if (Size == elements.length) {
            ensureCapa();
        }
        elements[Size++] = e;
    }
    //Cài đặt phương thức get()
   public E get(int i) {
        if (i > Size || i < 0 ) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
    return (E) elements[i] ;
    }
}
