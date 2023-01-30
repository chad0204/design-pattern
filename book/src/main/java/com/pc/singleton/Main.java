package com.pc.singleton;


import java.util.concurrent.*;

/**
 * @author dx
 * @className Main
 * @description TODO
 * @date 2019-08-04 17:28
 */
public class Main {

    private static final ThreadPoolExecutor executor = new ThreadPoolExecutor(
            2,
            2, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());


    static int errorCount = 0;


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        checkAndGet();
//        readCnt(1000000000L);
    }

    //测试count次初始化, 判断是否出现非单例的情况
    public static void checkAndGet() throws ExecutionException, InterruptedException {
        int count = 10000000;
        for (int i = 0; i < count; i++) {
            Future<SingletonV2> future1 = executor.submit(SingletonV2::getInstance);
            Future<SingletonV2> future2 = executor.submit(SingletonV2::getInstance);
            //注意一定要都submit再get(), get()是阻塞的
            if (future1.get() != future2.get()) {
                errorCount++;
                System.out.println("error");
            }
            SingletonV2.clear();
        }
        executor.shutdown();
        System.out.println("error cnt: " + errorCount);
    }

    //测试读性能
    public static void readCnt(long count) {
        long time = System.currentTimeMillis();
        for(long i = 0; i < count; i++) {
            SingletonV2.getInstance();
        }
        System.out.println(System.currentTimeMillis()-time);
    }

}
