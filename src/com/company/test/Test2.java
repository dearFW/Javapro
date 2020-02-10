package com.company.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by heystephen on 2020/2/6.
 */

/**实现类     ArrayList  动态数组				    		Vector    线程安全
 Vector   用法一致                               区别：ArrayList   非线程安全
 Linkedlist   用法一致			    区别  1  ArrayList底层是数组		Linkedlist底层是链表
 区别 2     ArrayList与LinkedList  尾部添加性能基本一样
 ArrayList与LinkedList  中间添加   LinkedList性能远远高于ArrayList    用list.add(index:0;element:100)
 ArrayList与LinkedList  读取时  ArrayList 性能远远高于LinkedList

 list.add(1)
 list.add(2)
 list.add(5)
 list.add(index:0;element:100)
 在数组 0  位置的地方嵌入 100    往前嵌入
 100 1 2 5
 list.size()     已添加的数字有多少
 list.addAll()    数组里添加集合或元素     不为空数组
 有返回值自带  boolean
 list.contains(100)    查询元素是否在集合内       返回值是boolean
 list.indexof(100)        查询元素在集合内的顺序
 *
 *
 *
 *
 *
 *
 * */
public class Test2 {
    public static void main(String[] args) {
        // Arraylist  和 Linkedlist  添加元素  对比性能差异
        //  添加之前 之后 都获取一个当前时间   取时间差
        List arraylist = new ArrayList();
        List linkedlist = new LinkedList();
        Date startarray = new Date();
        for(int i=0;i<100000;i++){
            arraylist.add(0,i);
        }
        Date endarray = new Date();
        System.out.println("ArrayList添加用时="+(endarray.getTime()-startarray.getTime()));
        Date startlinked = new Date();
        for(int i=0;i<100000;i++) {
            linkedlist.add(0,i);
        }
        Date endlinked = new Date();
        System.out.println("LinkedList添加用时="+(endlinked.getTime()-startlinked.getTime()));

       Date startreadarray = new Date();
        for(int i=0;i<arraylist.size();i++){
            Object  a = arraylist.get(i);
        }
        Date endreadarray = new Date();
        System.out.println("ArrayList读取用时="+(endreadarray.getTime()-startreadarray.getTime()));

        Date startreadlinked = new Date();
        for(int i=0;i<linkedlist.size();i++){
            Object  b = linkedlist.get(i);
        }
        Date endreadlinked = new Date();
        System.out.println("LinkedList读取用时="+(endreadlinked.getTime()-startreadlinked.getTime()));



    }
}
