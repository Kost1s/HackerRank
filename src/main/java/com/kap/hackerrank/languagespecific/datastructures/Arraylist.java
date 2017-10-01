package com.kap.hackerrank.languagespecific.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Konstantinos Antoniou
 */
public class Arraylist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<List<Integer>> lists = new ArrayList<>();

        int arrayListsNo = scanner.nextInt();
        for(int i = 0; i < arrayListsNo; i++) {
            int arrayListSize = scanner.nextInt();
            List<Integer> inputs = new ArrayList<>();
            for(int j = 0; j < arrayListSize; j++) {
                inputs.add(scanner.nextInt());
            }
            lists.add(i, inputs);
        }

        int queriesNo = scanner.nextInt();
        for(int q = 0; q < queriesNo; q++) {
            int listNo = scanner.nextInt() - 1;
            int listElement = scanner.nextInt() - 1;

            try {
                System.out.println(lists.get(listNo).get(listElement));
            } catch (IndexOutOfBoundsException | NullPointerException e) {
                System.out.println("ERROR!");
            }
        }

    }

}
