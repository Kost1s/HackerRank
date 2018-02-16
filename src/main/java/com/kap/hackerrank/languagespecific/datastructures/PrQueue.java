package com.kap.hackerrank.languagespecific.datastructures;

import com.kap.hackerrank.languagespecific.factory.Student;
import com.kap.hackerrank.languagespecific.comparators.StudentComparator;

import java.util.*;
/**
 * @author Konstantinos Antoniou
 */
public class PrQueue {

    public static void main(String[] args) {
        Comparator<Student> studentComparator = new StudentComparator();
        Queue<Student> priorityQueue = new PriorityQueue(5, studentComparator);

        Scanner in = new Scanner(System.in);
        int totalEvents = Integer.parseInt(in.nextLine());

        while(totalEvents>0){

            String event = in.next();

            if (event.equals("ENTER")) {
                String fname = in.next();
                double cgpa = in.nextDouble();
                int token = in.nextInt();

                priorityQueue.add(new Student(fname, cgpa, token));
            }

            if (event.equals("SERVED") && (!priorityQueue.isEmpty())) {
                    priorityQueue.remove();
                }

            totalEvents--;
        }

        if (priorityQueue.isEmpty()) {
            System.out.println("EMPTY");
        }

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove().getFname());
        }
    }
}
