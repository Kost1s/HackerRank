package com.kap.hackerrank.algorithms.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Konstantinos Antoniou
 */
public class PlusMinus {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.######");

        Scanner scanner = new Scanner(System.in);

        int arrayDim = scanner.nextInt();
        int[] array = new int[arrayDim];

        int posNumbers = 0;
        int negNumbers = 0;
        int zeroNumbers = 0;
        for(int i = 0; i < arrayDim; i++) {
            array[i] = scanner.nextInt();
            if(array[i] > 0) posNumbers = posNumbers + 1;
            if(array[i] < 0) negNumbers = negNumbers + 1;
            if(array[i] == 0) zeroNumbers = zeroNumbers + 1;
        }

        System.out.println(df.format(((float)posNumbers)/arrayDim));
        System.out.println(df.format(((float)negNumbers)/arrayDim));
        System.out.println(df.format(((float)zeroNumbers)/arrayDim));
    }

}
