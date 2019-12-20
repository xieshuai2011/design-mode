package 设计原则.单一职责原则;

/**
 * @author xieshuai
 * @date 2019/11/18 16:06
 */
public class People {

    public static void main(String[] args) {
        Language language = new Language();
        language.LanguageCN("北京人");
        language.LanguageCN("南京人");
        language.LanguageKO("韩国人");
    }

}
