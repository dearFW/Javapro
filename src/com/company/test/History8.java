package com.company.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by heystephen on 2020/2/14.
 */
public class History8 {
    public static void main(String[] args) {

    }

    public  int  numberof (int n){
        //  遍历写入1所有人数
        List <Integer> list = new ArrayList<> ();
        for(int i = 1; i<=n; i++){
            list.add(i);
        }
        int  m =1;
        while (list.size()>1){
            //m<3  全部放到最后一个
            if(m!=3){
                int fir = list.remove(0);
                list.add(fir);
            }
            else{
                //到3直接拿掉第一个  继续循环
                list.remove(0);
                m = 1;
            }

        }
        //报完数最后一个
        return  list.get(0);
    }

}
