package 建造者模式;

/**
 * @author xieshuai
 * @date 2019/11/14 14:51
 * @description：建造者
 */
public abstract class Builder {

    /**
     * 完成一杀
     */
    abstract void AKill();
    /**
     * 完成双杀
     */
    abstract void DoubleKill();
    /**
     * 完成三杀
     */
    abstract void TripleKill();
    /**
     * 完成四杀
     */
    abstract void QuadraKill();
    /**
     * 完成五杀
     */
    abstract void PentaKill();

    /**
     * 获取五杀成果
     */
    abstract PentaKill getPentaKill();

}
