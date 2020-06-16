package com.list.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SelectTimeTest {
    public static String runtime(List<Integer> list, String type){
        int total=100000;
        for (int i=0;i<total;i++){
            list.add(6);
            //list.add(6); 插入后面的话二者一样的   因为插入到最后面不会影响到其他的位置
        }
        long start=System.currentTimeMillis();
        for (int i=0;i<total;i++){
            int n=list.get(50000);
            n++;
            list.set(50000,n);
        }
        long end=System.currentTimeMillis();
        return "在"+type+"里面 定位 到第  50000 个数据，重复100000遍，总共耗时 "+(end-start)+" 毫秒，第五万数据从6变为"+list.get(50000);
    }
    public static void main(String[] args) {
        List<Integer> list;
        list=new ArrayList<>();
        System.out.println(runtime(list,"ArrayList"));
        list=new LinkedList<>();
        System.out.println(runtime(list,"LinkedList"));
    }
}
