package com.company.test;

/**
 * Created by heystephen on 2020/2/4.
 */
public class History4 {
    public static void main(String[] args) {
        for(int i=100;i<=999;i++){
            int a = i/100;
            int b = i/10%10;
            int c = i%10;

            if(i== a*a*a+b*b*b+c*c*c){
                System.out.println(i );
            }
        }
    }
}
