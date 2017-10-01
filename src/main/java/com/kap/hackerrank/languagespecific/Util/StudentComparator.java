package com.kap.hackerrank.languagespecific.Util;

import com.kap.hackerrank.languagespecific.Factory.Student;

import java.util.Comparator;

/**
 * @author Konstantinos Antoniou
 */
public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare (Student st1, Student st2) {
        int compareResult = 0;

        if(Double.compare(st2.getCgpa(), st1.getCgpa()) != 0) {
            if (st2.getCgpa() > st1.getCgpa()) {
                compareResult = 1;
            }
            if (st2.getCgpa() < st1.getCgpa()) {
                compareResult = -1;
            }
        } else {
            compareResult = st1.getFname().compareTo(st2.getFname());
        }

        if (compareResult == 0) {
            return st1.getToken() - st2.getToken();
        }

        return compareResult;
    }
}
