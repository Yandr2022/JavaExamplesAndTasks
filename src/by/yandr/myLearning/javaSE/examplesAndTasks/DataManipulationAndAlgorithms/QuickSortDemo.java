package by.yandr.myLearning.javaSE.examplesAndTasks.DataManipulationAndAlgorithms;

import java.util.Arrays;

public class QuickSortDemo {
    public static void main(String[] args) {
        String s = "sbchjkjhkghjkjhljhfdgftdazxcjklkghgfvjkdf";
        char[] c = s.toCharArray();
        System.out.println(c);
        sort(c);
        System.out.println(c);
    }

    static void sort(char[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    static void sort(char[] arr, int left, int right) {
        int top = left, bottom = right;
        char comparand = arr[(left + right) / 2], value;
        do {
            while ((arr[top] < comparand) && (top < right)) top++;
            while ((arr[bottom] > comparand) && (bottom > left)) bottom--;

            if (top <= bottom) {
                value = arr[top];
                arr[top++] = arr[bottom];
                arr[bottom--] = value;
            }
        } while (top <= bottom);
        if (((right + 1) - left) == arr.length) System.out.println(Arrays.toString(arr));

        if (left < bottom) {
            sort(arr, left, bottom);
        }
        if (top < right) sort(arr, top, right);
    }
}
