package 简单工厂;

import 品牌类.Adidas;
import 品牌类.DongFeng;
import 品牌类.HongQi;
import 品牌类.Nike;

import static java.lang.System.out;

/**
 * @author xieshuai
 * @date 2019/11/8 15:04
 * @description：简单工厂类
 */
public class SimpleFactory {

    private static final String ADIDAS = "Adidas";
    private static final String NIKE = "Nike";
    private static final String DONG_FENG = "DongFeng";
    private static final String HONG_QI = "HongQi";

    /**
     * 根据品牌英文名称获取各品牌实例对象
     * @param englishName
     * @return
     */
    public static Brand getInstance(String englishName){

        if(ADIDAS.equals(englishName)){
            return new Adidas();
        }else if(NIKE.equals(englishName)){
            return new Nike();
        }else if(DONG_FENG.equals(englishName)){
            return new DongFeng();
        }else if(HONG_QI.equals(englishName)){
            return new HongQi();
        }else {
            throw new RuntimeException(englishName+ "未能匹配到实例化对象！");
        }

    }

    public static void main(String[] args) {
        Brand adidas = SimpleFactory.getInstance(ADIDAS);
        out.println(ADIDAS+"创建的咖啡实例为:" + adidas.getName());
        Brand nike = SimpleFactory.getInstance(NIKE);
        out.println(NIKE+"创建的咖啡实例为:" + nike.getName());
        Brand dongFeng = SimpleFactory.getInstance(DONG_FENG);
        out.println(DONG_FENG+"创建的咖啡实例为:" + dongFeng.getName());
        Brand hongQi = SimpleFactory.getInstance(HONG_QI);
        out.println(HONG_QI+"创建的咖啡实例为:" + hongQi.getName());
    }

}
