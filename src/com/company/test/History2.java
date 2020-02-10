package com.company.test;

/**
 * Created by heystephen on 2020/2/4.
 */
public class History2 {
    //1 - 4 之间 拿出任意3个数  最多能组成多少个数字  并打印
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4};
        for (int i = 0; i < array.length; i++) {
            int I = 100 * array[i];
            for (int b = 0; b < array.length; b++) {
                int B = 10 * array[b];
                if(i !=b) {
                    for (int c = 0; c < array.length; c++) {
                        int C = 1 * array[c];
                        if(c!=b&&c!=i) {
                            System.out.println(I + B + C);
                        }
                    }
                }
            }
        }
    }
}



