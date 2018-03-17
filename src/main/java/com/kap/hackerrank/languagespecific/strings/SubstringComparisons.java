package com.kap.hackerrank.languagespecific.strings;

import java.util.*;

public class SubstringComparisons {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        List<String> result = getSmallestAndLargest(s, k);

        System.out.println(result.get(0));
        System.out.println(result.get(result.size()-1));
    }

    public static List<String> getSmallestAndLargest(String s, int k) {

        List<String> subStrings = new ArrayList<>();
        for(int i = 0; i <= (s.length() - k); i++) {
            subStrings.add(s.substring(i, i+k));
        }

        subStrings.sort(Comparator.naturalOrder());
        return subStrings;
    }

}
