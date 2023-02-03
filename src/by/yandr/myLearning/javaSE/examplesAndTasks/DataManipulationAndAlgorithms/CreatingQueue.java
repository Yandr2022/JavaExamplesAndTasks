package by.yandr.myLearning.javaSE.examplesAndTasks.DataManipulationAndAlgorithms;

import java.util.Arrays;

public class CreatingQueue {
    public static void main(String[] args) {
        char[] ar = new char[20];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (char)('a'+i);
        }
Queue queue = new Queue((char[]) ar);
        System.out.println(ar);
        for (int i = 0; i < 5; i++) {
            System.out.println(queue.get());
        }
    }
}
class Queue{
    private char[] q;
    private int getloc,putloc;


    Queue(int size) {
            q = new char[size+1];
            putloc = getloc = 0;
        }
    Queue(char[] arr) {
        q = new char[arr.length+1];
        putloc = getloc = 0;
        for (int i = 0; i < arr.length; i++) {
            put(arr[i]);
        }
    }
    Queue(Queue queue) {
        q = new char[queue.q.length];
        getloc = queue.getloc;
        putloc = queue.putloc;
        System.arraycopy(queue.q,0,q,0,queue.q.length);
    }

    boolean isFull(){
        return putloc==(q.length-1);
    }
    boolean isEmpty(){
        return getloc==putloc;
    }



    public void put(char ch) throws IllegalStateException {
            if (isFull()) {
                throw new IllegalStateException("Queue is Full");
            }
            q[putloc++] = ch;
        }


        public char get() throws IllegalStateException {
            if (isEmpty()) {
             throw new IllegalStateException("Queue is Empty");
            }
            return q[getloc++];
        }

    @Override
    public String toString() {
        return "Queue{" +
                "q=" + Arrays.toString(q) +
                ", getloc=" + getloc +
                ", putloc=" + putloc +
                '}';
    }
}
