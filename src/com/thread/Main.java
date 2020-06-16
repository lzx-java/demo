package com.thread;

import com.thread.Dao.Hero;

public class Main {

    public static void main(String[] args) {
       /* final Object f=new Object();*/
        System.out.println(Thread.currentThread().getName());
        Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
        gareen.damage = 50;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 30;

        Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 65;

        Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 455;
        leesin.damage = 80;
       /* new TestThread(gareen,teemo).start();
        new TestThread(bh,leesin).start();*/    //多线程模式

       /* for (int i=0;i<10;i++) {*/
            Thread thread1 = new Thread() {
                public void run(){
                    while (true){
                        try {
                            gareen.hurt();
                            Thread.sleep(200);
                            System.out.println("gareen减血----------当前血量:"+gareen.hp);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            /*    @Override
                public void run() {
                    while (!teemo.isDead()) {
                        gareen.attackHero(teemo);
                        System.out.println("garenn 线程名称：" + Thread.currentThread().getName());
                    }
                }*/
            };
            thread1.start();
       /*     System.out.println(i+"号线程准备完毕");
        }*/
        Thread thread2=new Thread(){
            public void run(){
                while (true){
                    try {
                        Thread.sleep(500);
                        gareen.recover();
                        System.out.println("gareen加血+++++++++当前血量:"+gareen.hp);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
               /* while (!leesin.isDead()){
                    *//*synchronized (f) {*//*
                        bh.attackHero(leesin);
                        System.out.println("bh 线程名称：" + Thread.currentThread().getName());
                    *//*}*//*
                }*/
            }
        };
        thread2.start();
 /*       try {
            //t1线程加入到main线程中来，只有t1线程运行结束，才会继续往下走
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
        System.out.println("主线程执行完毕");
    }

}
