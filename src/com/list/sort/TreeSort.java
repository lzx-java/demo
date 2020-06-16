package com.list.sort;

import java.util.List;
import java.util.Random;

public class TreeSort {
    int number[];
    Node n;

    public TreeSort(Node n,int[] number){
        this.n=n;
        this.number=number;
    }

    public void sort(){
        long start = System.currentTimeMillis();
        for (int a:number){
            n.addNode(a);
        }
        List<Object> list= n.selectValues();
        long end = System.currentTimeMillis();
        System.out.println("运行时间+遍历时间："+(end-start));
        System.out.println(list);
    }


    public static void main(String[] args) {
        int sum[] =new int[40000];
        for (int i=0;i<40000;i++){
            sum[i]=new Random().nextInt(40000);
        }
        new TreeSort(new Node(),sum).sort();
    }
}
