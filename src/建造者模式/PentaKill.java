package 建造者模式;

/**
 * @author xieshuai
 * @date 2019/11/14 14:40
 * @description：完成五杀的步骤
 */
public class PentaKill {

    private String one;
    private String two;
    private String three;
    private String four;
    private String five;

    @Override
    public String toString() {
        return "PentaKill{" +
                "one='" + one + '\'' +
                ", two='" + two + '\'' +
                ", three='" + three + '\'' +
                ", four='" + four + '\'' +
                ", five='" + five + '\'' +
                '}';
    }

    public PentaKill() {
    }

    public PentaKill(String one, String two, String three, String four, String five) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
    }

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    public String getThree() {
        return three;
    }

    public void setThree(String three) {
        this.three = three;
    }

    public String getFour() {
        return four;
    }

    public void setFour(String four) {
        this.four = four;
    }

    public String getFive() {
        return five;
    }

    public void setFive(String five) {
        this.five = five;
    }
}
