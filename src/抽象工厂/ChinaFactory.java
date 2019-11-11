package 抽象工厂;

import 公共类.Alibaba;
import 公共类.Amazon;
import 公共类.DongFeng;
import 简单工厂.Brand;

/**
 * @author xieshuai
 * @date 2019/11/11 11:18
 * @description：中国工厂
 */
public class ChinaFactory implements AbstractInternetFactory{
    @Override
    public Brand getBrand() {
        return new DongFeng();
    }

    @Override
    public Alibaba getAlibaba() {
        return new Alibaba();
    }

    @Override
    public Amazon getAmazon() {
        return null;
    }
}
