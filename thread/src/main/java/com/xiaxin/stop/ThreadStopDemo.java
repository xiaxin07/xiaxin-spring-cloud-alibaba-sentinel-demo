package com.xiaxin.stop;

import static java.lang.Thread.sleep;

/**
 * 如何停止掉一个线程
 */
public class ThreadStopDemo {
    static Thread thread = null;
    static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        interrupt();
        sleep(2000);
        running = false;
        thread.interrupt();
    }

    /**
     * 如果使用退出循环标志 这种方式没法解阻塞
     */
    public static void traditional() {
        thread = new Thread(() -> {
            while (running) {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("execute");
            }
        });
        thread.start();
    }

    /**
     * interrupt中断线程可以解阻塞 但是不能真正停止线程，可以结合退出标志一起使用
     */
    public static void interrupt() {
        thread = new Thread() {
            @Override
            public void run() {
                while (running && !this.isInterrupted()) {
                    System.out.println("execute start");
                    try {
                        sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("execute end");
                }
            }
        };
        thread.start();
    }
}
