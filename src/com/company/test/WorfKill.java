package com.company.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by heystephen on 2020/2/12.
 */
public class WorfKill {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入玩家人数");
        int number = input.nextInt();
        if (number < 12 || number > 18) {
            System.out.println("玩家人数输入错误：");
        }
        else {
            System.out.println("游戏开始了");
        }
        input.close();

        String[] godcards = new String[]{"预言家", "女巫", "丘比特", "守卫", "猎人", "村长", "替罪羊", "吹笛者", "盗贼"};

        String[] peoplecards = new String[]{"村民", "村民", "村民", "村民", "村民", "村民", "村民",};

        String[] wolfcards = new String[]{"狼人", "狼人", "狼人", "狼人", "狼人", "狼人"};

        int[] player = new int [18];
        for (int i=0;i<=17;i++) {
          player[i] = i+1;
        }
        String[] Bottomcards = new String[]{"01:", "02:", "03:"};

        if(number==12){
               String [] allcars = new String [15];
                    for(int j =0;j<=3;j++){
                        allcars[j]= peoplecards[j];
                        allcars[j+3]= wolfcards[j];
                        allcars[j+7]= godcards[j];
                    }
                    allcars[12] = "猎人";
                    allcars[13] = "村长";
                    allcars[14] = "盗贼";
        }
    }

    }
