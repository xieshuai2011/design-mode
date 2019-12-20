package 设计原则.迪米特法则;

/**
 * @author xieshuai
 * @date 2019/12/5 9:55
 * @description：中介类
 */
public class Middleman {

    /**
     * 房东名
     */
    private Landlord fdName;
    /**
     * 租客名
     */
    private Tenant zkName;

    public Landlord getFdName() {
        return fdName;
    }

    public void setFdName(Landlord fdName) {
        this.fdName = fdName;
    }

    public Tenant getZkName() {
        return zkName;
    }

    public void setZkName(Tenant zkName) {
        this.zkName = zkName;
    }

    public void contract(){
        System.out.println("【" + fdName.getFdName() + "】" + "和" + "【" + zkName.getZkName() + "】" + "通过中介签署租房合同");
    }

}
