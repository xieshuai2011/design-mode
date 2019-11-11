package 抽象工厂;

import 公共类.Alibaba;
import 公共类.Amazon;
import 简单工厂.Brand;

/**
 * @author xieshuai
 * @date 2019/11/11 11:11
 * @description：抽象的品牌互联网工厂类
 */
public interface AbstractInternetFactory {

    /**
     * 获取品牌
     * @return
     */
    Brand getBrand();

    /**
     * 获取中国阿里巴巴
     * @return
     */
    Alibaba getAlibaba();

    /**
     * 获取外国亚马逊
     * @return
     */
    Amazon getAmazon();

}
