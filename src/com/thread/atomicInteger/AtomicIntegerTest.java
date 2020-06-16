package com.thread.atomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {
    private static int i=0;
    private static AtomicInteger atomicInteger=new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads=new Thread[10000];
        for (int i=0;i<10000;i++){
            Thread thread=new Thread(){
                public void run(){
                    atomicInteger.incrementAndGet();
                    /*AtomicIntegerTest.i++;*/   //使用累加测试
                   /* System.out.println("开始运行");*/
                }
            };
          /*  System.out.println("开启线程");*/
            thread.start();
            threads[i]=thread;
        }
        for (Thread t:threads){
           /* System.out.println("加入主线程,如果不加入主线程那么主线程结束了之后才会开始运行子线程");*/
             t.join();
        }
        System.out.println(atomicInteger);
    }
}
