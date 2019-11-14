package 建造者模式;

/**
 * @author xieshuai
 * @date 2019/11/14 14:57
 * @description：具体建造者
 */
public class ConcreteBuilder extends Builder{

    PentaKill pentaKill = new PentaKill();

    @Override
    void AKill() {
        pentaKill.setOne("完成一杀");
    }

    @Override
    void DoubleKill() {
        pentaKill.setTwo("完成双杀");
    }

    @Override
    void TripleKill() {
        pentaKill.setThree("完成三杀");
    }

    @Override
    void QuadraKill() {
        pentaKill.setFour("完成四杀");
    }

    @Override
    void PentaKill() {
        pentaKill.setFive("完成五杀");
    }

    @Override
    PentaKill getPentaKill() {
        return pentaKill;
    }
}
