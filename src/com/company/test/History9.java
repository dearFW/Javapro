package com.company.test;

/**
 * Created by heystephen on 2020/2/15.
 */
public class History9 {
    //求完全平方数
    public static void main(String[] args) {
            for (int i = 1; i < 1000; i++) {
                int m=(int) Math.sqrt((i+100));
                int n=(int) Math.sqrt((i+100+168));
                if (m*m==i+100&&n*n==i+100+168) {
                    System.out.println("这个数是"+i);
                }
            }

        }
    }
