package com.thread.xiaof;

public class Main1 {
    public static void main(String[] args) {
        MyStack<Integer> stack=new MyStack<>();
        new ProduceThread(stack,"P1").start();
        new ProduceThread(stack,"P2").start();
        new ProduceThread(stack,"P3").start();
        new ConsumberThread(stack,"C1").start();
        new ConsumberThread(stack,"C2").start();
    }
}
