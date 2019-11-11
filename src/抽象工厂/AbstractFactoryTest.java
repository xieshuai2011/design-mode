package 抽象工厂;

import 产品类.Alibaba;
import 产品类.Amazon;
import 简单工厂.Brand;

import java.nio.file.attribute.AttributeView;

/**
 * @author xieshuai
 * @date 2019/11/11 11:21
 * @description：抽象工厂测试类
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractInternetFactory chinaFactory = new ChinaFactory();
        Brand brand = chinaFactory.getBrand();
        Alibaba alibaba = chinaFactory.getAlibaba();
        Amazon amazon = chinaFactory.getAmazon();
        System.out.println("中国工厂有如下产品：");
        print(brand);
        print(alibaba);
        print(amazon);
        System.out.println("---------------------");
        AbstractInternetFactory foreignFactory = new ForeignFactory();
        brand = foreignFactory.getBrand();
        alibaba = foreignFactory.getAlibaba();
        amazon = foreignFactory.getAmazon();
        System.out.println("外国工厂有如下产品：");
        print(brand);
        print(alibaba);
        print(amazon);
    }

    static void print(Brand brand) {
        if(brand == null){
            System.out.println("无此产品");
        }else {
            System.out.println(brand.getName());
        }
    }

}
