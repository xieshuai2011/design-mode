package 设计原则.里式替换原则;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author xieshuai
 * @date 2019/11/19 14:58
 * @description：
 */
public class IStudentImpl implements IStudent {

    @Override
    public List<Student> getStudent() {
        ArrayList<Student> stu = new ArrayList<>();
        stu.add(new Student("tom","一班"));
        stu.add(new Student("mary","二班"));
        stu.add(new Student("mike","三班"));
        return stu;
    }

//    @Override
//    public List<Student> getStudent() {
//        Collection<Student> stu = null;
//        stu.add(new Student("tom","一班"));
//        stu.add(new Student("mary","二班"));
//        stu.add(new Student("mike","三班"));
//        return stu;
//    }

}
