package 建造者模式;

/**
 * @author xieshuai
 * @date 2019/11/14 15:07
 * @description：建造者模式测试类
 */
public class BuilderTest {

    public static void main(String[] args) {
        Director director = new Director();
        PentaKill pentaKill = director.pentaKill(new ConcreteBuilder());
        System.out.println(pentaKill);
    }

}
