package com.company.test;

/**
 * Created by heystephen on 2020/2/5.
 */

public class History5 {
    private int array[];
    private int size;
    public History5(){
        size = 0;
        array = new int[10];
    }
    public  int getsize(){
        return size;
    }
    public void add(int i){
        if(size>=array.length){
            int[] newarray = new int[size+size/2];
            for (int j=0;j<array.length;j++){
                newarray[j]=array[j];
            }
            array = newarray;
            System.out.println("扩容完成为"+array.length);
        }
        array[size++]=i;
    }
    public int get(int i){
       if(i<0||i>=size){
           System.out.println("索引错误");
           return -1;
       }
       return array[i];
    }
}
/*
*
* 建立数组   构造方法 （建立初始个数）（初始个数为0）（实际返回个数）
构造 添加方法  判断存放个数 与  数组个数 大小     判断是否添加容量
扩大容量的方式  定义个更大的数组  把原来的数组复制进去      大数组与原来数组呈倍数关系
把老数组名给新数组名
通过循环取值 0--size-1
利用循环和之前建立方法往外拿输入的值
*
* */