package com.kap.hackerrank.algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] ar = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = in.nextInt();
        }
        in.close();

        int result = getPairs(k, ar);
        System.out.println(result);
    }

    public static int getPairs(int k, int[] ar) {
        int result=0;

        Arrays.sort(ar);

        int j;
        for(int i=0; i< ar.length; i++) {
            j=ar.length-1;
            while(j > 0) {
                if((ar[j] - ar[i]) == k) {
                    result+=1;
                }
                j--;
            }
        }

        return result;
    }

}
