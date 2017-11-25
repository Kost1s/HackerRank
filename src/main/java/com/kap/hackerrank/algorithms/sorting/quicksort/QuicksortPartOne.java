package com.kap.hackerrank.algorithms.sorting.quicksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static com.kap.hackerrank.Utils.readSizeAndElementsOfIntArray;

public class QuicksortPartOne {

    public static void main(String[] args) {
        int[] ar = readSizeAndElementsOfIntArray();
        quickSortPartOne(ar);
    }

    public static void quickSortPartOne(int[] ar) {
        int[] equal = {ar[0]};
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        int pivot = ar[0];

        for(int i=1; i < ar.length; i++) {
            if (ar[i] < pivot) {
                left.add(ar[i]);
            } else {
                right.add(ar[i]);
            }
        }
        printElements(equal, left, right);
    }

    private static void printElements(int[] equal, List<Integer> left, List<Integer> right) {
        left.forEach(e -> System.out.print(e + " ") );
        Arrays.stream(equal).forEach(e -> System.out.print(e + " "));
        right.forEach(e -> System.out.print(e + " "));
    }

}
