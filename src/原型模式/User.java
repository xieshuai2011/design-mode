package 原型模式;

import java.io.Serializable;

/**
 * @author xieshuai
 * @date 2019/11/12 16:14
 * @description：用户类
 */
public class User implements Serializable {
    String a;
    String b;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public User() {
    }

    public User(String a, String b) {
        this.a = a;
        this.b = b;
    }
}
