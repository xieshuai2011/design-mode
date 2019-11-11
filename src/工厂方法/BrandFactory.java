package 工厂方法;

import 简单工厂.Brand;

/**
 * @author xieshuai
 * @date 2019/11/8 16:22
 * @description：品牌抽象工厂
 */
public abstract class BrandFactory {

    /**
     * 获取可生产的品牌
     */
    public abstract Brand[] getBrand();

}