package 原型模式;

/**
 * @author xieshuai
 * @date 2019/11/12 14:43
 * @description：浅克隆
 */
public class ShallowClone implements Cloneable{

    String name;
    String sex;

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

    public ShallowClone(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public ShallowClone() {
    }

    @Override
    public String toString() {
        return "ShallowClone{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    protected ShallowClone clone() {
        try {
            return (ShallowClone) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        ShallowClone shallowClone = new ShallowClone("小马","男");
        ShallowClone clone = shallowClone.clone();
        System.out.println(shallowClone);
        System.out.println(clone);
        System.out.println(shallowClone.toString());
        System.out.println(clone.toString());

    }
}
