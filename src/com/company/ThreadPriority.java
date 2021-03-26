package com.company;

public class ThreadPriority {

    public static void main(String[] args) {
        //主线程默认优先级
        System.out.println(Thread.currentThread().getName() +":"+ Thread.currentThread().getPriority());
        MyPriority myPriority = new MyPriority();
        Thread t1 = new Thread(myPriority);
        Thread t2 = new Thread(myPriority);
        Thread t3 = new Thread(myPriority);
        Thread t4 = new Thread(myPriority);
        Thread t5 = new Thread(myPriority);
        Thread t6 = new Thread(myPriority);
        //设置优先级 在启动
        t1.start();

        t2.setPriority(1);
        t2.start();;

        t3.setPriority(4);
        t3.start();

        t4.setPriority(Thread.MAX_PRIORITY);
        t4.start();

        t5.setPriority(5);
        t5.start();

        t6.setPriority(7);
        t6.start();

    }
}


class MyPriority implements Runnable{

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +":"+ Thread.currentThread().getPriority());
    }


}