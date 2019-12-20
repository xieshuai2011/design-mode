package 设计原则.接口隔离原则;

/**
 * @author xieshuai
 * @date 2019/12/4 16:52
 * @description：
 */
public class ServiceImpl implements QueryService,UpdateService {

    public static QueryService getQueryService()
    {
        return new ServiceImpl();
    }
    public static UpdateService getUpdateService()
    {
        return new ServiceImpl();
    }

    @Override
    public void QueryClazz() {
        System.out.println("调用班级查询接口");
    }

    @Override
    public void QueryStudent() {
        System.out.println("调用学生查询接口");
    }

    @Override
    public void QueryTeacher() {
        System.out.println("调用老师查询接口");
    }

    @Override
    public void UpdateClazz() {
        System.out.println("调用班级修改接口");
    }

    @Override
    public void UpdateStudent() {
        System.out.println("调用学生修改接口");
    }

    @Override
    public void UpdateTeacher() {
        System.out.println("调用老师修改接口");
    }
}
