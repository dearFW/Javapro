package com.company.test;

/**
 * Created by heystephen on 2020/2/10.
 */
public class Mytext3 {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("好角色",4000,11);
        System.out.println(salariedEmployee.getSalary(11));
        HourlyEmployee hourlyEmployee = new HourlyEmployee(30,170,"好角色2号",12);
        System.out.println(hourlyEmployee.getSalary(12));
        SalesEmployee salesEmployee = new SalesEmployee("好角色3号",10,200000,0.3);
        System.out.println(salesEmployee.getSalary(10));


    }
}
