package 设计原则.依赖倒置原则;

/**
 * @author xieshuai
 * @date 2019/11/20 10:56
 * @description：篮球
 */
public class BasketBall implements Ball{

    @Override
    public String playBall() {
        return "打篮球";
    }

}
