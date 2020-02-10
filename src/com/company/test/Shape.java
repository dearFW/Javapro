package com.company.test;

/**
 * Created by heystephen on 2020/2/10.
 */
public abstract class Shape {
    private  Float area;
    private  Float per;
    private String color;
    public   Shape(){}
    public  Shape(String color){
        this.color=color;
    }
    public  String getcolor(){
        return color;
    }
    public abstract double getArea();
    public abstract double getPer();
    public abstract void showAll();

}
