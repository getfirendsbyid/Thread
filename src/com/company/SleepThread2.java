package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

//模拟倒计时，
public class SleepThread2 implements Runnable{
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

    }

    public static void main(String[] args) {
//        try {
//            tenDown();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        while (true){
            Date startTime = new Date(System.currentTimeMillis());//获取系统当前时间
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("YYYY-mm-dd hh:mm::ss").format(startTime));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void tenDown() throws InterruptedException {
        int num = 10;
        while(true){
            Thread.sleep(1000);
            System.out.println(num--);
            if (num<=0){
                break;
            }
        }
    }
}
