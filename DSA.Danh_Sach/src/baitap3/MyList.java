package baitap3;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity < 0) {
            System.out.println("không hợp lệ với độ dài");
        } else {
            elements = new Object[capacity];
        }
    }

    public void add(int index, E element) {
//        for (int i = 0; i < size; i++) {
//            elements[i] = elements[i - 1];
//        }
//        elements[index] = element;
//        size++;
        if (size == elements.length){
            ensureCapacity();
        }
        elements[size ++ ] = element;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index " + index + " k đúng");
        }
    }
    public E remove(int index) {
        E temp = (E) elements[index];
        for (int i = index; i <  size; i++) {
            elements[i] = elements [index + 1 ] ;
        }
        elements[size - 1 ] = null ;
        size -- ;
        return temp ;
    }
    public int size (){
        return this.size ;
    }
    public boolean contains (E o) {
        for (int i = 0; i < size; i++) {
            if (elements.equals(elements[i])) ;
            return true ;
        }
        return false ;
    }
    public int indexOf (E o){
        for (int i = 0; i < size; i++) {
            if (elements.equals(elements[i])) ;
            return i;
        }
        return -1 ;
    }
    public boolean add (E o) {
        return false ;
    }
    public void ensureCapacity () {
        int newSize = elements.length * 2 ;
        elements = Arrays.copyOf(elements,newSize) ;
    }
    public E get (int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index  :"  + index + "size :" + index);
        }
        return (E) elements[index] ;
    }
    public void clear () {
        elements = (E []) new Object [DEFAULT_CAPACITY] ;
        size = 0 ;
    }
    public void printMyList () {
        int i  = 0 ;
        for (E e : (E []) elements) {
            System.out.println("Element " + i + " : " + e);
            i ++ ;
        }
    }
}

