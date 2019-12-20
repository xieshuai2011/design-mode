package 设计原则.开闭原则;

/**
 * @author xieshuai
 * @date 2019/11/14 18:18
 * @description：书籍
 */
public class Book extends IBookImpl{

    public Book(String name,String author,int price){
        super(name,author,price);
    }

    @Override
    public int getPrice() {
        int oldPrice = super.getPrice();
        int newPrice = 0;
        if (oldPrice <= 20){
            newPrice = oldPrice * 90 / 100 ;
        }else {
            newPrice = oldPrice * 50 / 100 ;
        }
        return newPrice;
    }
}
