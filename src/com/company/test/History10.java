package com.company.test;

/**
 * Created by heystephen on 2020/2/16.
 */
//内部类
public class History10 {
    public static void main(String[] args) {
        INTERface jia = new INTERface() {
            @Override
            public int method(int a, int b) {
                return a+b;
            }
        };
        System.out.println(method(10,2,jia));
        //变形写法   直接用a b 运算
        System.out.println(method(12,20,(a,b)->{
            return a-b;
        }));
    }

    public static  int method(int a,int b,INTERface inteRface){
        return inteRface.method(a,b);
    }
}




