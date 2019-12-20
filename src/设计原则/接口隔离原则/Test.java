package 设计原则.接口隔离原则;

/**
 * @author xieshuai
 * @date 2019/12/4 17:27
 * @description：测试类
 */
public class Test {

    public static void main(String[] args) {
        QueryService queryService = ServiceImpl.getQueryService();
        UpdateService updateService = ServiceImpl.getUpdateService();
        queryService.QueryClazz();
        updateService.UpdateStudent();
    }

}
