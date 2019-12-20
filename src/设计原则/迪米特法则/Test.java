package 设计原则.迪米特法则;

/**
 * @author xieshuai
 * @date 2019/12/5 10:02
 * @description：测试类
 */
public class Test {

    public static void main(String[] args) {
        Middleman middleman = new Middleman();
        middleman.setFdName(new Landlord("A房东"));
        middleman.setZkName(new Tenant("C租客"));
        middleman.contract();
    }

}
