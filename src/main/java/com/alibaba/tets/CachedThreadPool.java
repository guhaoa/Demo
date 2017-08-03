package com.alibaba.tets;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

/**
 * @author MSI
 * @date 2017/08/01
 */
public class CachedThreadPool {
    public static void main(String[] args) {
       /* ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(index + "--"+ "fixedTgreadPool");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

        }*/

       /*//定长线程池,,支持定时及周期性任务执行;延迟执行示例代码如下
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("delay 3 seconds");
            }
        },1,3, TimeUnit.SECONDS);*/
       //单个线程池
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        
        for (int i = 0; i < 10; i++) {
            final int index = i;
            singleThreadExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(index);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

        }
    }

    @Test
    public void test02() {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
             final int index = i;
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(index + "--"+ "fixedTgreadPool");
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            
        }
    }

    @Test
    public void test03() {
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);
    }
}
