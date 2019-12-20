package 设计原则.开闭原则;

/**
 * @author xieshuai
 * @date 2019/11/14 18:12
 * @description：书籍实现类
 */
public class IBookImpl implements IBook{

    private String name;
    private String author;
    private int price;

    public IBookImpl(String _name, String _author, int _price) {
        this.name = _name;
        this.author = _author;
        this.price = _price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
