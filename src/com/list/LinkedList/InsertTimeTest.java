package com.list.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InsertTimeTest {
    public static String runtime(List<Integer> list,String type){
        int total=100000;
        long start=System.currentTimeMillis();
        for (int i=0;i<total;i++){
            list.add(0,6);
            //list.add(6); 插入后面的话二者一样的   因为插入到最后面不会影响到其他的位置
        }
        long end=System.currentTimeMillis();
        return "在"+type+"最前面插入 100000 条数据，总共耗时 "+(end-start)+" 毫秒";
    }
    public static void main(String[] args) {
        List<Integer> list;
        list=new ArrayList<>();
        System.out.println(runtime(list,"ArrayList"));
        list=new LinkedList<>();
        System.out.println(runtime(list,"LinkedList"));
    }
}
