package com.thread.Dao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hero {
    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                '}';
    }

    SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
    public String name;
    public float hp;

    public int damage;

    public Hero(){

    }
    public Hero(String name){
        this.name=name;
    }
    public void attackHero(Hero h) {
        try {
            //为了表示攻击需要时间，每次攻击暂停1000毫秒
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        h.hp-=damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);

        if(h.isDead())
            System.out.println(h.name +"死了！");
    }

    public synchronized void recover(){
        System.out.println("加血"+Thread.currentThread().getName()+"+++++++++"+format.format(new Date()));
        if (this.hp==666){
            this.notify();
        }
        hp=hp+10;
    }

    public synchronized void hurt() throws InterruptedException {
        System.out.println("扣血"+Thread.currentThread().getName()+"----------"+format.format(new Date()));
        while (this.hp<=10){
            System.out.println("111111111111111111111111111111111111111111111111111");
            this.wait();
            System.out.println("22222222222222222222222222222222222222222222222222222");
        }
        hp=hp-10;
    }
    public boolean isDead() {
        return 0>=hp?true:false;
    }
}
