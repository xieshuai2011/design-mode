package 原型模式;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xieshuai
 * @date 2019/11/12 14:58
 * @description：深克隆
 */
public class DeepClone implements Cloneable, Serializable {

    String name;
    String sex;
    User user;

    @Override
    public String toString() {
        return "DeepClone{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", user=" + user +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public DeepClone() {
    }

    public DeepClone(String name, String sex, User user) {
        this.name = name;
        this.sex = sex;
        this.user = user;
    }

    @Override
    protected DeepClone clone(){
        try {
            DeepClone clone = (DeepClone) super.clone();
            try {
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(bos);
                oos.writeObject(clone.getUser());
                ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                ObjectInputStream ois = new ObjectInputStream(bis);
                User user = (User) ois.readObject();
                clone.setUser(user);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        User user = new User("a","b");
        DeepClone deepClone = new DeepClone("小马","男",user);
        DeepClone clone = deepClone.clone();
        System.out.println(deepClone);
        System.out.println(clone);
    }
}
