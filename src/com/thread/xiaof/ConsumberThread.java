package com.thread.xiaof;

public class ConsumberThread extends Thread {
    private MyStack<Integer> stack;

    public ConsumberThread(MyStack<Integer> stack,String name){
        super(name);
        this.stack=stack;
    }

    public void run(){
        while (true){
            try {
                stack.pull();
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
