package com.company.test;

/**
 * Created by heystephen on 2020/2/5.
 */
public class Chinese extends Person{
    public static void main(String[] args) {
        Chinese FENG = new  Chinese();
        FENG.setAge(1010);
        FENG.eyescolor();
        int age = FENG.getAge();
        System.out.println(age);

    }
}
