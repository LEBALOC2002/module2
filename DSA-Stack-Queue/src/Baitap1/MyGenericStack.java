package Baitap1;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private final LinkedList<T> stack;

    public MyGenericStack() {

        stack = new LinkedList<>();
    }
    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.size() != 0;
    }

    public static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("five");
        stack.push("four");
        stack.push("three");
        stack.push("tow");
        stack.push("one");
        System.out.println("1.1. Size of stack after push operations: " + stack.size());
        System.out.print("1.2. Pop elements from stack : ");
        while (stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println(("\n1.3. Size of stack after pop operations : " + stack.size()));
    }

    static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.print("2.2. Pop elements from stack : ");
        while (stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
    }
}
