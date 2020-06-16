package com.thread.thread;

import com.thread.Dao.Hero;

public class TestThread extends Thread {
    private Hero h1;
    private Hero h2;

  public TestThread() {

    }

    public TestThread(Hero h1, Hero h2) {
        this.h1 = h1;
        this.h2 = h2;
    }

    public void run() {
        System.out.println("线程名称：" + Thread.currentThread().getName());
        while (!h2.isDead()) {
            h1.attackHero(h2);
        }
    }
}
