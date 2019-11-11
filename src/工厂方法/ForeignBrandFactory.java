package 工厂方法;

import 产品类.Adidas;
import 产品类.Nike;
import 简单工厂.Brand;

/**
 * @author xieshuai
 * @date 2019/11/8 16:26
 * @description：外国品牌工厂
 */
public class ForeignBrandFactory extends BrandFactory{

    /**
     * 由子类来决定实现哪一个实例
     * @return
     */
    @Override
    public Brand[] getBrand() {
        return new Brand[]{new Adidas(),new Nike()};
    }

}
