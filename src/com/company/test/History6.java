package com.company.test;

/**
 * Created by heystephen on 2020/2/5.
 */
public class History6 {
    public static void main(String[] args) {
        History5 myarray = new History5();
        for(int i=1;i<=100;i++){
            myarray.add(i);
        }
        for (int i=0; i<myarray.getsize();i++){
            System.out.println(myarray.get(i));
        }
    }
}
