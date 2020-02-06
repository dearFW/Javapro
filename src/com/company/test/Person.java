package com.company.test;

/**
 * Created by heystephen on 2020/2/3.
 */
public class Person {
    private int eyes;
    private int age;

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getAge() {
        if (age > 1000) {
            System.out.println("输出错误");
        } else {
        }
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void eyescolor(){
        System.out.println("棕色");
    }

}
    /*public static int add (int a,int b);
    int c = a+ b;
    return  c; */
