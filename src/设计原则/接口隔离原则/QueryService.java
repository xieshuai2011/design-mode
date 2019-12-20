package 设计原则.接口隔离原则;

/**
 * @author xieshuai
 * @date 2019/12/4 16:48
 * @description：查询接口
 *
 */
public interface QueryService {

    /**
     *  查询班级
     */
    void QueryClazz();

    /**
     * 查询学生
     */
    void QueryStudent();

    /**
     * 查询老师
     */
    void QueryTeacher();

}
