package 设计原则.接口隔离原则;

/**
 * @author xieshuai
 * @date 2019/12/4 16:48
 * @description：修改接口
 *
 */
public interface UpdateService {

    /**
     *  修改班级
     */
    void UpdateClazz();

    /**
     * 修改学生
     */
    void UpdateStudent();

    /**
     * 修改老师
     */
    void UpdateTeacher();

}
