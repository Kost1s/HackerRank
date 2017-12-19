package com.kap.hackerrank.languagespecific;

import java.util.Scanner;

/**
 * @author Konstantinos Antoniou
 */
public class StaticInitializer {

    public static final int b;
    public static final int h;
    public static boolean flag;

    static {
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        h = sc.nextInt();

        if((b >= 0) && (h >= 0)) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=b*h;
            System.out.print(area);
        }

    }

}

