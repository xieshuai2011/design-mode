package 单例模式;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author xieshuai
 * @date 2019/11/11 16:11
 * @description：懒汉式单例
 */
public class LazySingleton {

    /**
     * 将自身实例化对象设置为一个属性，并用static修饰
     */
    private static LazySingleton instance;

    /**
     * 静态方法返回该实例
     * @return
     */
    public static LazySingleton getInstance() {
        if(instance == null) {
            try {
                //为了使模拟效果更直观，这里延时1ms，具体看时序图
                TimeUnit.NANOSECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new LazySingleton();
        }
        return instance;
    }

    public static LazySingleton getInstanceSync(){
        if(instance == null){
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new LazySingleton();
        }
        return instance;
    }

    public static void main(String[] args) throws InterruptedException {
        //模拟下多线程环境下实例可能不唯一的情况
        CountDownLatch startSignal = new CountDownLatch(1);
        for (int i = 0; i < 2; i++) {
            Thread t = new Thread(new MyThread(startSignal));
            t.setName("thread "+i);
            t.start();
        }
        Thread.sleep(1000);
        startSignal.countDown();
    }



    static class MyThread implements Runnable {

        private final CountDownLatch startSignal;

        public MyThread(CountDownLatch startSignal){
            this.startSignal = startSignal;
        }

        @Override
        public void run() {
            try {
                System.out.println("current thread : " + Thread.currentThread().getName() + " is waiting.");
                startSignal.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            LazySingleton l = LazySingleton.getInstance();
            System.out.println(l);
        }

    }

}
