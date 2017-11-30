package com.kap.hackerrank.algorithms.sorting.mergesort;

public class MergeSort {

    public static void main(String args[]) {
        int input[];
        input = new int[]{6, 3, 2, 5, 7, 4, 8, 1};
        sort(input, 0, input.length - 1);
    }

    public static void sort(int[] nums, int left, int right) {
        if (left < right) {
            //Split in half
            int mid = (left + right) / 2;
            //Sort recursively.
            sort(nums, left, mid);
            sort(nums, mid + 1, right);

            //Merge the two sorted sub arrays.
            merge(nums, left, mid, right);
        }
    }

    private static void merge(int[] nums, int left, int mid, int right) {
        // nums[left…mid] and A[mid+1…right] are the two sorted sub arrays to be merged.
        int size = right - left + 1;
        int temp[] = new int[size];
        //Copy the array into temp so that we can replace merged result into nums[left...right]
        //This is an extra space and time overhead in this merge sorting.
        for (int i = 0; i < size; i++) {
            temp[i] = nums[left + i];
        }
        //Changed positions in temp array.
        mid = mid - left;
        right = right - left;
        int k = left;
        int i = 0; // new left is (left - left) which is 0;
        int j = mid + 1;
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                nums[k] = temp[i];
                i++;
            } else {
                nums[k] = temp[j];
                j++;
            }
            k++;
        }

        if (i > mid) {
            //copy remaining elements from right
            for (; j <= right; j++, k++) {
                nums[k] = temp[j];
            }
        } else {
            //copy remaining elements from left
            for (; i <= mid; i++, k++) {
                nums[k] = temp[i];
            }
        }
    }

}
