package com.kap.hackerrank.languagespecific.datastructures;

import java.util.*;

/**
 * @author Konstantinos Antoniou
 */
public class JavaDequeue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arSize = sc.nextInt();
        int subArSize = sc.nextInt();

        int[] ar = new int[arSize];
        for (int i = 0; i < arSize; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(getMaxUniqueIntegers(ar, subArSize));
    }

    public static int getMaxUniqueIntegers(int[] ar, int subArSize) {
        Deque<Integer> integerDeque = new ArrayDeque<>();
        Set<Integer> uniqueElements = new HashSet<>();

        int max = 0;
        for (int i = 0; i < ar.length; i++) {
            integerDeque.offer(ar[i]);
            uniqueElements.add(ar[i]);
            if (integerDeque.size() == subArSize) {
                if (uniqueElements.size() > max) {
                    max = uniqueElements.size();
                }
                Integer temp = integerDeque.poll();
                if (!integerDeque.contains(temp)) {
                    uniqueElements.remove(temp);
                }
            }
        }

        return max;
    }

}