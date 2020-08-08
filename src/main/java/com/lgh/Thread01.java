package com.lgh;

public class Thread01 extends Thread {
    public static void main(String[] args) {

        Thread01 thread01 = new Thread01();
        thread01.start();
        // 直接调run方法只会顺序执行
        //thread01.run();
        // 推荐使用 runnable，java是单继承
        Runnable01 Runnable01 = new Runnable01();
        new Thread(Runnable01).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("我是主线程..."+i);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("我是run方法..."+i);
        }
    }
}

class Runnable01 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("我是runnable接口中的run方法..."+i);
        }
    }
}
