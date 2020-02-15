package com.company.test;

/**
 * Created by heystephen on 2020/2/15.
 */
public class History88 {
    public static void main(String[] args) {
        System.out.println(method());
    }
    //小球下落每次小0.5倍问题
    public static double method() {
        double a = 100;
        for (int n = 1; n <10; n++) {
           a = a*0.5;
        }

        return a;
    }
}
