package 设计原则.开闭原则;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xieshuai
 * @date 2019/11/14 17:56
 * @description：书店
 */
public class BookStore {

    private static final List<Book> bookList = new ArrayList<>();

    static {
        bookList.add(new Book("西游记","吴承恩",10));
        bookList.add(new Book("红楼梦","施耐庵",20));
        bookList.add(new Book("水浒传","罗贯中",50));
    }

    public static void main(String[] args) {
        for (Book book : bookList) {
            System.out.println("书籍名称： " + book.getName()
                    +"\t书籍作者： "+book.getAuthor()
                    +"\t书籍价格： "+book.getPrice());
        }
    }
}
