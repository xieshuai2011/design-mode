package 设计原则.里式替换原则;

/**
 * @author xieshuai
 * @date 2019/11/19 14:46
 * @description：学生类
 */
public class Student {

    private String name;

    private String clazz;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", clazz='" + clazz + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public Student() {
    }

    public Student(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
    }
}
