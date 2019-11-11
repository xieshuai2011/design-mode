package 抽象工厂;

import 产品类.Alibaba;
import 产品类.Amazon;
import 产品类.DongFeng;
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
