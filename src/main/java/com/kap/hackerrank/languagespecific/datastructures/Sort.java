package com.kap.hackerrank.languagespecific.datastructures;

import com.kap.hackerrank.languagespecific.Factory.Student;
import com.kap.hackerrank.languagespecific.Util.StudentComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Konstantinos Antoniou
 */
public class Sort {

    public static void main(String[] args){

        List<Student> studentList = new ArrayList();

        /*studentList.add(new Student(33, "Rumpa", 3.68));
        studentList.add(new Student(85, "Ashis", 3.85));
        studentList.add(new Student(56, "Samiha", 3.75));
        studentList.add(new Student(19, "Samara", 3.75));
        studentList.add(new Student(22, "Fahim", 3.76));*/

        Collections.sort(studentList, new StudentComparator());

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
