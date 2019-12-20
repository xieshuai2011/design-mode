package 设计原则.依赖倒置原则;

/**
 * @author xieshuai
 * @date 2019/11/20 10:59
 * @description：测试
 */
public class PayTest {

    public static void main(String[] args) {

        Person person = new Person();
        person.person(new BasketBall());
        person.person(new FoutBall());

    }

}
