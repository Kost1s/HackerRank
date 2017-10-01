package com.kap.hackerrank.languagespecific.Factory;

/**
 * @author Konstantinos Antoniou
 */
public class Student {

    private int id;
    private String fname;
    private double cgpa;
    public Student(String fname, double cgpa, int token) {
        super();
        this.id = token;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getToken() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}
