package 抽象工厂;

import 产品类.Alibaba;
import 产品类.Amazon;
import 产品类.Nike;
import 简单工厂.Brand;

/**
 * @author xieshuai
 * @date 2019/11/11 11:20
 * @description：外国工厂
 */
public class ForeignFactory implements AbstractInternetFactory{
    @Override
    public Brand getBrand() {
        return new Nike();
    }

    @Override
    public Alibaba getAlibaba() {
        return null;
    }

    @Override
    public Amazon getAmazon() {
        return new Amazon();
    }
}
