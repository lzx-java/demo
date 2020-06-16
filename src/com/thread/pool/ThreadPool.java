package com.thread.pool;

import java.util.LinkedList;

public class ThreadPool {

    // 线程池大小
    int threadPoolSize;

    // 任务容器
    LinkedList<Runnable> tasks = new LinkedList<Runnable>();

    // 试图消费任务的线程

    public ThreadPool() {
        threadPoolSize = 10;

        // 启动10个任务消费者线程
        synchronized (tasks) {
            for (int i = 0; i < threadPoolSize; i++) {
                System.out.println("创造消费者线程 "+i);
                new TaskConsumeThread("任务消费者线程 " + i).start();

            }
        }
    }

    public void add(Runnable r) {
        synchronized (tasks) {    //这个地方修饰是因为 我在对我的任务栈操作的时候  你不能同步消费掉  因为 这样会造成空数据 空任务所以必须保证线程独占  我主线程会独占这个资源
            tasks.add(r);
            System.out.println("添加任务完毕,当前线程为:"+Thread.currentThread().getName());
            // 唤醒等待的任务消费者线程
            tasks.notifyAll();
        }
    }

    class TaskConsumeThread extends Thread {
        public TaskConsumeThread(String name) {
            super(name);
        }

        Runnable task;

        public void run() {
            System.out.println("启动： " + this.getName());
            while (true) {
                synchronized (tasks) {
                    while (tasks.isEmpty()) {
                        try {
                            System.out.println("线程"+this.getName()+"开始等待");
                            tasks.wait();   //这个地方不能用this  因为  tasks.wait 就表示当前占有他的线程 开始等待
                            System.out.println("线程"+this.getName()+"完成等待");
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                    task = tasks.removeLast();
                    // 允许添加任务的线程可以继续添加任务  this.getname=thread.---.getname
                    /*tasks.notifyAll();*/   /*这个要不要无所谓*/

                }
                System.out.println(this.getName() + " 获取到任务，并执行");
                task.run();
            }
        }
    }

}