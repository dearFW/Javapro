package com.company.test;

/**
 * Created by heystephen on 2020/2/10.
 */
public class History66 {
    //计算最大公约数和最小公倍数
    public static void main(String[] args) {

        int x=10;
        int y=100;
        int max=1;
        int min=max(x,y);
        for(int i=1;i<=x&&i<=y;i++){
            if(x%i==0&&y%i==0){
                max=i;
            }
        }
        for(int i=min;i<=x*y;i++){
            if(i%x==0&&i%y==0){
                min=i;
                break;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    public static int max(int a,int b){
        // 三目运算符
        return (a>b)?a:b;
    }
}

