package com.list.sort;

import java.util.Arrays;
import java.util.Random;

public class BubblingSort {
    int[] number;
    public BubblingSort(int[] number){
        this.number=number;
    }

    public int[] sort() {
        long start= System.currentTimeMillis();
        for (int i = 0; i < number.length-1; i++) {
            for (int j = 0; j < number.length - 1 - i; j++) {
                if (number[j] > number[j + 1]) {
                    int t = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = t;
                }
            }
        }
        long end= System.currentTimeMillis();
        System.out.println("排序时间："+(end-start));
        System.out.println(Arrays.toString(number));
        return number;
    }

    public static void main(String[] args) {
        /*int sum[] =new int[40000];
        for (int i=0;i<40000;i++){
            sum[i]=new Random().nextInt(40000);
        }*/
        int sum[] =new int[]{9,8,7,6,5,4,3,2,1,0};
        new BubblingSort(sum).sort();
    }
}
