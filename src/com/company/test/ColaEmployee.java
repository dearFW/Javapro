package com.company.test;

/**
 * Created by heystephen on 2020/2/10.
 */
public abstract class ColaEmployee {
    public ColaEmployee(String name,int month){
        this.month = month;
        this.name= name;
    }
    private String name;
    private int month;
    public abstract double getSalary(int month);
}
