package com.company;

//模拟网络延时，，放大问题的发生性
public class SleepThread implements Runnable{

    private int ticketNums = 10;
    public static void main(String[] args) {
	// write your code here
        SleepThread ticket = new SleepThread();
        new Thread(ticket,"张杰").start();
        new Thread(ticket,"余威").start();
        new Thread(ticket,"刘明").start();
    }

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
        while (true){
            if (ticketNums<=0){
                break;
            }
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->拿到了第"+ticketNums--+"票");
        }
    }
}
