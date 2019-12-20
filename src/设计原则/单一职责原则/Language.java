package 设计原则.单一职责原则;

/**
 * @author xieshuai
 * @date 2019/11/18 16:33
 */
public class Language {

    public void LanguageCN(String name){
        System.out.println(name + "讲汉语");
    }
    public void LanguageKO(String name){
        System.out.println(name + "讲韩语");
    }

}
