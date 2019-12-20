package 设计原则.迪米特法则;

/**
 * @author xieshuai
 * @date 2019/12/5 9:54
 * @description：租客类
 */
public class Tenant {

    /**
     * 租客名
     */
    private String zkName;

    public String getZkName() {
        return zkName;
    }

    public void setZkName(String zkName) {
        this.zkName = zkName;
    }

    public Tenant() {
    }

    public Tenant(String zkName) {
        this.zkName = zkName;
    }

    @Override
    public String toString() {
        return "Tenant{" +
                "zkName='" + zkName + '\'' +
                '}';
    }
}
