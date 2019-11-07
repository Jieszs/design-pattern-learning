/**
 * @author zj
 * @date 2019/11/6
 */
public interface IUser {
    /**
     * 添加
     * @param user
     */
    void insert(IUser user);

    /**
     * 查询
     * @param id
     * @return
     */
    String get(Integer id);
}
