package com.company.test;

/**
 * Created by heystephen on 2020/2/10.
 */
public class HourlyEmployee extends ColaEmployee{
    private int hour;
    private int hoursalary;
    public HourlyEmployee(int hour,int hoursalary,String name,int month){
        super(name,month);
        this.hour = hour;
        this.hoursalary = hoursalary;
    }

    @Override
    public double getSalary(int month) {
        if(hour<=160){
            return hour*hoursalary;
        }
        else{
            return  160*hoursalary + (160-hour)*1.5*hoursalary;
        }
    }
}
