package com.thread;

import java.util.LinkedList;

public class App<R> {
    LinkedList<R> linkedList=new LinkedList<>();
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(123);
        list.add(456);
        list.add(567);
        for (Integer list1:list){
            System.out.println(list1);
        }
        System.out.println("查看"+list.getFirst());
        System.out.println("查看后尺寸"+list.size());
       /* int i=list.removeLast();*/
        int i=list.poll();
        System.out.println("取出后大小为");
        System.out.println(i);
        System.out.println(list.size());
        new App<String>().linkedList.add("x");
        for (Integer list1:list){
            System.out.println(list1);
        }

        System.out.println(list.getLast());

    }
}
