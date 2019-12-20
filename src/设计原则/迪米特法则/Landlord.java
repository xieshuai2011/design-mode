package 设计原则.迪米特法则;

/**
 * @author xieshuai
 * @date 2019/12/5 9:52
 * @description：房东类
 */
public class Landlord {

    /**
     * 房东名
     */
    private String fdName;

    public String getFdName() {
        return fdName;
    }

    public void setFdName(String fdName) {
        this.fdName = fdName;
    }

    public Landlord() {
    }

    public Landlord(String fdName) {
        this.fdName = fdName;
    }

    @Override
    public String toString() {
        return "Landlord{" +
                "fdName='" + fdName + '\'' +
                '}';
    }
}
