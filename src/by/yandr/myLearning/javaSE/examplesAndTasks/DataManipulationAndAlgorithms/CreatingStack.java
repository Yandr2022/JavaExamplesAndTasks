package by.yandr.myLearning.javaSE.examplesAndTasks.DataManipulationAndAlgorithms;


import java.util.Arrays;

public class CreatingStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }
        System.out.println(stack);

    }
}

class Stack {
    private Object[] stack;
    private int top;
    static final int DEFAULT_CAPACITY = 10;

    public Stack() {
        stack = new Object[DEFAULT_CAPACITY];
        top = -1;
    }

    /**
     * @return true if Stack is Empty, else - false
     */
    boolean isEmpty() {
        return top == -1;
    }

    /**
     * @return last element of Stack
     */
    Object top() {
        return isEmpty() ? null : stack[top];
    }

    /**
     * pops top element from the stack
     */
    void pop() {
        if (isEmpty()) return;
        top--;
    }

    /**
     * @return pops and returns top element from the stack
     */
    Object topAndPop() {
        return isEmpty() ? null : stack[top--];
    }

    /**
     * adds element to stack
     *
     * @paramx adds object
     */
    public void push(Object elem) {
        if (top + 1 == stack.length) {
         doubleArray();
        }
        stack[++top] = elem;
    }

    /**
     * clear Stack
     */
    void makeEmpty() {
        top = -1;
    }

    private void doubleArray() {
        Object[] newStack = new Object[stack.length * 2];
        for (int i = 0; i < stack.length; i++) {
            System.arraycopy(stack, 0, newStack, 0, stack.length);
        }
        stack = newStack;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stack=" + Arrays.toString(stack) +
                ", top=" + top +
                '}';
    }
}