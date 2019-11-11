package 单例模式;

/**
 * @author xieshuai
 * @date 2019/11/11 16:50
 * @description：饿汉式单例
 */
public class HungrySingleton {

    private static final String CLASS_NAME = "HungrySingleton";

    private static final HungrySingleton instance = new HungrySingleton();

    static {
        //这里可以看到类加载后，优先加载上方的静态成员变量
        System.out.println("类加载时创建:"+instance);
    }

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(HungrySingleton.CLASS_NAME);
        System.out.println("------------------");
        HungrySingleton a = HungrySingleton.getInstance();
        System.out.println(a);
        HungrySingleton b = HungrySingleton.getInstance();
        System.out.println(b);
    }
}
