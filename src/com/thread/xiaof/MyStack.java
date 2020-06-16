package com.thread.xiaof;

import java.util.LinkedList;

public class MyStack<T> {
    LinkedList<T> list=new LinkedList();
    public synchronized void push(T t) throws Exception{
        while (list.size()>=50){
            this.wait();
        }
        this.notifyAll();
        list.add(t);
        System.out.println("最后的值为:"+list.getLast());
        System.out.println("目前长度为:----------------------------------------"+list.size());
        System.out.println("当前线程名称为:-------------------------------"+Thread.currentThread().getName());
    }

    public synchronized T pull() throws Exception{
        while (list.isEmpty()){
            this.wait();
        }
        this.notifyAll();
        System.out.println("目前长度为:----------------------------------------"+list.size());
        System.out.println("当前线程名称为:-------------------------------"+Thread.currentThread().getName());
        return list.removeLast();
    }


}

