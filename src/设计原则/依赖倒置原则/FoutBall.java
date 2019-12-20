package 设计原则.依赖倒置原则;

/**
 * @author xieshuai
 * @date 2019/11/20 10:56
 * @description：足球
 */
public class FoutBall implements Ball{

    @Override
    public String playBall() {
        return "踢足球";
    }

}
