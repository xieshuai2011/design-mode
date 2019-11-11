package 单例模式;

/**
 * @author xieshuai
 * @date 2019/11/11 17:14
 * @description：双检查锁机制
 */
public class DoubleCheckedLockingSingleton {

    /**
     * 将自身实例化对象设置为一个静态属性
     */
    private static DoubleCheckedLockingSingleton singleton;

    /**
     * 构造私有化
     */
    private DoubleCheckedLockingSingleton(){}

    /**
     * 静态方法返回实例
     */
    public static DoubleCheckedLockingSingleton getInstance(){
        //检查是否被实例化
        if(singleton == null){
            synchronized (DoubleCheckedLockingSingleton.class){
                //某个线程取得了类锁，实例化对象前第二次检查instance是否已经被实例化出来，如果没有，才最终实例出对象
                if (singleton == null){
                    singleton = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return singleton;
    }
}
