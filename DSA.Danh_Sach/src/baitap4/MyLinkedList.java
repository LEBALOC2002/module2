package baitap4;
import java.util.Arrays;
import java.util.Objects;

public class MyLinkedList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ELEMENTDATA = {};
    private E[] elements;

    public MyLinkedList() {
        this.elements = (E[])new Object[DEFAULT_CAPACITY];
    }

    public MyLinkedList(int capacity) {
        if (capacity > 0) {
            this.elements = (E[]) new Object[capacity];
        } else if (capacity == 0) {
            this.elements = (E[]) EMPTY_ELEMENTDATA;
        } else {
            System.err.println("Kích thước mảng không đúng");
        }
    }

    private void ensureCapacity() {
        if (size > elements.length) {
            E[] newData = (E[]) new Object[size * 2 + 1];
            System.arraycopy(elements, 0, newData, 0, size);
            elements = newData;
        }
    }

    public void add(E element) {
        size++;
        ensureCapacity();
        elements[size - 1] = element;
    }

    public void add(int index, E element) {
        if (index > size || index < 0) {
            System.out.println("Index is not validation");
        } else {
            size++;
            ensureCapacity();
            for (int i = elements.length - 1; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
        }
    }

    public E remove(int index) {
        if (index >= 0 && index < size) {
            E temp = elements[index];
            for (int i = index; i < size-1; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
            return temp;
        } else {
            System.out.println("Index is not validation");
            return null;
        }
    }

    public int size() {
        return size;
    }

    @Override
    public MyLinkedList<E> clone() {
        MyLinkedList<E> clone = new MyLinkedList<>(elements.length);
        for (E element : elements) {
            clone.add(element);
        }
        return clone;
    }

    public boolean contains(E o) {
        for (E x : elements) {
            if (Objects.equals(x, o)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public E get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        }
        return null;
    }

    public E[] getData() {
        return this.elements;
    }

    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "elements=" + Arrays.toString(elements) ;
    }
}

