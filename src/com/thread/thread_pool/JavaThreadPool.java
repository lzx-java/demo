package com.thread.thread_pool;

import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class JavaThreadPool {
    public void dsaa(){

    }
    public static <shrot> void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(7, 10, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());

/*    for (int i =0;i<19;i++){
        int finalI = i;
        pool.execute(new Runnable() {
         @Override
         public void run() {
             System.out.println("线程池名称:"+Thread.currentThread().getName()+"第"+ finalI +"循环");
         }
     });
    }*/
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程池名称:"+Thread.currentThread().getName()+"第1任务");
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程池名称:"+Thread.currentThread().getName()+"第2任务");
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程池名称:"+Thread.currentThread().getName()+"第3任务");
            }
        });
        System.out.println("主线程执行完毕");
        pool.shutdown();

        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };

        // copyOfRange(int[] original, int from, int to)
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)
        int[] b = Arrays.copyOfRange(a, 0, 5);

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        float z=0.125545f;
        double xx= z;
        float zxc=(float) Double.parseDouble(String.format("%.4f",xx));
        System.out.println(zxc);
         short aaa=1;
         short bbb=1;
         long aaax=1111111111111111111l;
        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";

        char c = sentence.charAt(0);

        System.out.println(c);


        char[] cs = sentence.toCharArray(); //获取对应的字符数组

        System.out.println(sentence.length() == cs.length);

        //截取从第3个开始的字符串 （基0）
        String subString1 = sentence.substring(3);

        System.out.println(subString1);

        //截取从第3个开始的字符串 （基0）
        //到5-1的位置的字符串
        //左闭右开
        String subString2 = sentence.substring(0,5);
        System.out.println(sentence.indexOf(","));
        System.out.println(subString2);


        System.out.println(sentence.contains("击杀")); //是否包含字符串"击杀"

        String temp = sentence.replaceAll("击杀", "被击杀"); //替换所有的

        temp = temp.replaceAll("超神", "超鬼");

        System.out.println(temp);
        temp = sentence.replaceFirst(",","");//只替换第一个

        System.out.println(temp);

        String te= "lel there be light";
       char ddd='1';
       Character dsadsa='2';
       String dasdsa=dsadsa.toString();
       String dadas=Character.toString(ddd);
        String se="";
        String[] ts=te.split(" ");
        for (int i=0;i<ts.length;i++){
            se=se+" "+ts[i].replaceFirst(Character.toString(ts[i].charAt(0)),Character.toString(Character.toUpperCase(ts[i].charAt(0))));
        }
        System.out.println(se);

    String last="Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
       String last1[]=last.split(" ");
       String end="";
       int count=0;
       for (int i=0;i<last1.length;i++){
           if (last1[i].contains("two")){
               count=i;
           }
       }
       last1[count]=last1[count].replaceFirst("t","T");
        for (int i=0;i<last1.length;i++){
            end=end+" "+last1[i];
        }
        System.out.println(end);
        StringBuffer buffer=new StringBuffer("dsa");
        System.out.println(buffer);
        buffer.append(12350);
        System.out.println(buffer);
        buffer.append("dsad");
        System.out.println(buffer);
        buffer.delete(1,3);
        System.out.println(buffer);
        buffer.insert(2,"~~~");
        System.out.println(buffer);
        buffer.reverse();
        System.out.println(buffer);


    }
}
