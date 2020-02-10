package com.company.test;

/**
 * Created by heystephen on 2020/2/10.
 */
public class SalesEmployee extends ColaEmployee {
    private int number;
    private double price;
    public SalesEmployee(String name, int month, int number, double price){
        super(name,month);
        this.number= number;
        this.price = price;
    }

    @Override
    public double getSalary(int month) {
        return number*price;
    }
}
