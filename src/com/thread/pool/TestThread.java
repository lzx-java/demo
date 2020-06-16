package com.thread.pool;
public class TestThread {

    public static void main(String[] args) {
        ThreadPool pool = new ThreadPool();

        for (int i = 0; i < 10; i++) {
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    System.out.println("当前线程："+Thread.currentThread().getName());
                    //System.out.println("执行任务");
                    //任务可能是打印一句话
                    //可能是访问文件
                    //可能是做排序
                }
            };

            pool.add(task);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("主线程执行完毕"+Thread.currentThread().getName());

    }

}