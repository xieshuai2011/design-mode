package 工厂方法;

import 产品类.DongFeng;
import 产品类.HongQi;
import 简单工厂.Brand;

/**
 * @author xieshuai
 * @date 2019/11/8 16:24
 * @description：中国品牌工厂
 */
public class ChinaBrandFactory extends BrandFactory{

    /**
     * 由子类来决定实现哪一个实例
     * @return
     */
    @Override
    public Brand[] getBrand() {
        return new Brand[]{new DongFeng(),new HongQi()};
    }

}
