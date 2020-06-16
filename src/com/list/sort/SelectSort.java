package com.list.sort;

import java.util.Arrays;
import java.util.Random;

public class SelectSort {
    int number[];
    public SelectSort(int[] number){
        this.number=number;
    }

    public int[] sort(){
        int t;
        long start= System.currentTimeMillis();
        for (int i=0;i<number.length-1;i++){
            for (int j=i+1;j<number.length;j++){
                if (number[i]>number[j]){
                    t=number[j];
                    number[j]=number[i];
                    number[i]=t;
                }
            }
        }
        long end= System.currentTimeMillis();
        System.out.println("排序时间："+(end-start));
       return number;
    }

    public static void main(String[] args) {
        int sum[] =new int[40000];
        for (int i=0;i<40000;i++){
            sum[i]=new Random().nextInt(40000);
        }
        new SelectSort(sum).sort();
    }
}
