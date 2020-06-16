package com.thread.xiaof;

import java.util.Random;

public class ProduceThread extends Thread {
    private MyStack<Integer>  stack;
    public ProduceThread(MyStack<Integer>  stack,String name){
        super(name);
        this.stack=stack;
    }
  /*  public char randomChar(){
        return (char) (Math.random()*('Z'+1-'A') + 'A');
    }*/

    public void run(){
        while (true){
            int c= new Random().nextInt(9);
            try {
                stack.push(c);
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

