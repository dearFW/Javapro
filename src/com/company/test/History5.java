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
