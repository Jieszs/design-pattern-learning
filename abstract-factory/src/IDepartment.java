/**
 * @author zj
 * @date 2019/11/6
 */
public interface IDepartment {
    /**
     * 添加
     */
    void insert(IDepartment department);

    /**
     * 查询
     * @return
     */
    String get(Integer id);
}
