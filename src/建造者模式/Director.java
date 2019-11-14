package 建造者模式;

/**
 * @author xieshuai
 * @date 2019/11/14 15:03
 * @description：指挥其完成五杀
 */
public class Director {

    public PentaKill pentaKill(Builder builder){
        builder.AKill();
        builder.DoubleKill();
        builder.TripleKill();
        builder.QuadraKill();
        builder.PentaKill();
        return builder.getPentaKill();
    }

}
