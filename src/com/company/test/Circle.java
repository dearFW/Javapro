package com.company.test;

/**
 * Created by heystephen on 2020/2/10.
 */
public class  Circle extends  Shape {
    private double raduis;
    public Circle(){}

    @Override
    public double getArea() {
        return 3.14*raduis*raduis;
    }

    @Override
    public double getPer() {
        return 2*3.14*raduis;
    }

    @Override
    public void showAll() {System.out.println("圆周长为"+getPer()+"圆面积为"+getArea());
        System.out.println("圆颜色为"+getcolor());
    }

    ;
    public Circle(double raduis,String color){
        super(color);
        this.raduis = raduis;
    };

}
