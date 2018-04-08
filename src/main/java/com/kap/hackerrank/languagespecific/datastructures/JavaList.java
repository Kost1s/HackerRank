package com.kap.hackerrank.languagespecific.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Konstantinos Antoniou
 */
public class JavaList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> integerList = new ArrayList<>();

        int listSize = sc.nextInt();
        for (int i = 0; i < listSize; i++) {
            integerList.add(sc.nextInt());
        }


        int queriesNumber = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < queriesNumber; i++) {
            String operation = sc.nextLine();
            String[] arItems = sc.nextLine().split(" ");

            int[] instructions = new int[arItems.length];
            for (int j = 0; j < arItems.length; j++) {
                int instruction = Integer.parseInt(arItems[j].trim());
                instructions[j] = instruction;
            }

            updateList(integerList, operation, instructions);
        }
        integerList.forEach(integer -> System.out.print(integer + " "));
        sc.close();
    }

    private static void updateList(List<Integer> list, String operation, int[] instructions) {
        if ("Insert".equals(operation)) {
            list.add(instructions[0], instructions[1]);
        } else if ("Delete".equals(operation)) {
            list.remove(instructions[0]);
        }
    }

}
