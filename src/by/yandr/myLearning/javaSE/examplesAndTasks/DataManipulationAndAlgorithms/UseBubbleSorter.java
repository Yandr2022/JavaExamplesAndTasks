package by.yandr.myLearning.javaSE.examplesAndTasks.DataManipulationAndAlgorithms;

import java.util.Arrays;

public class UseBubbleSorter {
    public static void main(String[] args) {
int[] nums = {12,6,8,-4,0,95,0};
        System.out.println(Arrays.toString(nums));
        sort(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void sort(int[] nums) {
        for (int i = 1, temp; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[j - 1] > nums[j]) {
                    temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}

