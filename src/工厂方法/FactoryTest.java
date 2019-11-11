package 工厂方法;

import 简单工厂.Brand;

/**
 * @author xieshuai
 * @date 2019/11/8 16:28
 * @description：工厂方法测试
 */
public class FactoryTest {

    static void print(Brand[] brands){
        for (Brand brand : brands) {
            System.out.println(brand.getName());
        }
    }

    public static void main(String[] args) {
        ChinaBrandFactory chinaBrandFactory = new ChinaBrandFactory();
        Brand[] chinaBrand = chinaBrandFactory.getBrand();
        System.out.println("中国品牌有：");
        print(chinaBrand);
        ForeignBrandFactory foreignBrandFactory = new ForeignBrandFactory();
        Brand[] foreignBrand = foreignBrandFactory.getBrand();
        System.out.println("外国品牌有：");
        print(foreignBrand);

    }

}
